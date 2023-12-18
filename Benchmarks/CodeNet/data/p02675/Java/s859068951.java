/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int temp=n%10;
			if(temp==2||temp==4||temp==5||temp==7||temp==9)
			{
				System.out.println("hon");
			}
			else if(temp==3)
			{
				System.out.println("bon");
				
			}
			else
			{
				System.out.println("pon");
			}
	}
}