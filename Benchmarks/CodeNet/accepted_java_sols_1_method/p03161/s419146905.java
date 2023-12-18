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
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		
		int dp[]=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(a[0]-a[1]);
		
		for(int i=2;i<n;i++)
		{
		    int min=Integer.MAX_VALUE;
		    for(int j=1;j<=k;j++)
		    {
		        if(i-j>=0)
		    min=Math.min(Math.abs(a[i]-a[i-j])+dp[i-j],min);
		    }
		    dp[i]=min;
		}
		System.out.println(dp[n-1]);
	}
}
