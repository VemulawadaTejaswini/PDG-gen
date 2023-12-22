/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		if(s.length()>k)
		{
			for(int i=0;i<k;i++)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print("...");
		}
		else
		{
			System.out.println(s);
		}
	}
}