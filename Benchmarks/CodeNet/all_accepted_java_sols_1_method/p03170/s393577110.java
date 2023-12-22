/* package codechef; // don't place package name! */

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
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int dp[]=new int[k+1];
		Arrays.fill(dp,2);
		for(int i=1;i<=k;i++){
		    for(int j=0;j<n;j++){
		        if(a[j]>i) continue;
		        
		        if(dp[i-a[j]]==2)
		        dp[i]=1;
		    }
		}
		String ans= dp[k]==1 ? "First":"Second";
		System.out.println(ans);
	}
}
