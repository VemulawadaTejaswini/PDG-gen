/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		
		long n=s.nextLong();
		if(n%2==0)
		{long k=n/2;
		System.out.println(k-1);}
		else
		{System.out.println(n/2);}
	}
}
