/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int wt=in.nextInt();
		int [] w=new int [n];
		int [] v=new int [n];
		for(int i=0;i<n;i++)
		{
			w[i]=in.nextInt();
			v[i]=in.nextInt();
		}
		long [][] ans =new long [n][wt+1];
		for(int i=w[0];i<=wt;i++)
		{
			ans[0][i]=v[0];
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<=wt;j++)
			{
				if(j>=w[i])
				{
					ans[i][j]=Math.max(ans[i-1][j],(ans[i-1][j-w[i]]+v[i]));
				}
				else
				{
					ans[i][j]=ans[i-1][j];
				}
			}
		}
		long max=0;
		for(int i=0;i<=wt;i++)
		{
			if(ans[n-1][i]>max)
			{
				max=ans[n-1][i];
			}
		}
		System.out.println(max);
	}
}