package printingXpattern;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
//as pacakge we are taking printingXpattern because the program is to print X pattern
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program

public class Xpattern {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//declares a class called Xpattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		
		System.out.print("Enter N:\n");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		//Inside the brackets is value which to be printed		
						
		int n=sc.nextInt();//it will scans next token of the input as int
		int arr[][]=new int[n][n];//creating an array list object and initializing them
		//inserting values in array
		for(int i=0;i<n;i++)//starting value for i=0
		{
			for (int s=0;s<n;s++)
			{
				if(i==s || (i+s)==(n-1))//here i value is equal to j and those values 
					//sum is equal to number -1
					System.out.print('*');// printing the value
				else//to test various conditions
					System.out.print(' ');
			}
			System.out.println(' ');//printing the value in next line
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
		}
		}

	}


