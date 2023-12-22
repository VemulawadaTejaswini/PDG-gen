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
		long n=sc.nextLong(),k=sc.nextLong();
		long ans=n%k;
		System.out.println(Math.min(ans,Math.abs(ans-k)));
	}
}