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
		int n=s.nextInt();
		String c=s.next();
		n=n%26;
		for(int i=0;i<c.length();i++)
		{int k=(int)c.charAt(i)+n;
		 if(k>90)
		    {int l=k-90-1;
		    k=65+l;}
		    System.out.print((char)k);
		}}}