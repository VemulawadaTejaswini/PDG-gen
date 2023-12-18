/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String t=sc.nextLine();
	    String s=sc.nextLine();
	    int x=t.length();
	    int c=0;
	    for(int i=0;i<x;i++)
	    {
	        if(t.charAt(i)!=s.charAt(i))
	        c++;
	       }
	       System.out.println(c);
	   }
}