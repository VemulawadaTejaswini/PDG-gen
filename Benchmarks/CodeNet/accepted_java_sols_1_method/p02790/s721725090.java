/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long m=s.nextLong();
		long a=n;
		long b=m;
		for(int i=1;i<m;i++)
		{a=a*10+n;}
		for(int i=1;i<n;i++)
		{b=b*10+m;}
		if(n>m)
		System.out.println(b);
	    else
	    System.out.println(a);
	}}