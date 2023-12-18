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
		int n=sc.nextInt(), k=sc.nextInt(), c=sc.nextInt()+1;
		char[] car=sc.next().toCharArray();
		int[] dp=new int[n], dprev=new int[n];
		for(int i=0;i<n;i++){
			if(car[i]!='x')dp[i]=1+(((i-c)>=0)?dp[i-c]:0);
			else dp[i]=((i-1)>=0)?dp[i-1]:0;
		}
		for(int i=n-1;i>=0;i--){
			if(car[i]!='x')dprev[i]=1+(((i+c)<n)?dprev[i+c]:0);
			else dprev[i]=((i+1)<n)?dprev[i+1]:0;
		}
		StringBuilder ans=new StringBuilder();
		// System.out.println(Arrays.toString(dp)+" "+Arrays.toString(dprev));
		for(int i=0;i<n;i++){
			if(car[i]!='x'){
				int l = (((i-1)>=0)?dp[i-1]:0),r=(((i+1)<n)?dprev[i+1]:0);
				if(l+r<k){
					ans.append((i+1)+"\n");
				}
			}
		}
		System.out.print(ans);
	}
}