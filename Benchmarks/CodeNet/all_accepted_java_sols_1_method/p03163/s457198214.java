/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int w=s.nextInt();
		int a[]=new int[n];
		int v[]=new int[n];
		long dp[]=new long[w+1];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		    v[i]=s.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
		   for(int j=w;a[i-1]<=j;j--)
		   {
		       dp[j]=Math.max(dp[j-a[i-1]]+v[i-1],dp[j]);
		   }
		}
		System.out.println(dp[w]);
	
	}
}
