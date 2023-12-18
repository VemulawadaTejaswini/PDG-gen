/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char [][] arr=new char[n][m];
		long[][] dp=new long[n][m];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next().toCharArray();
		    Arrays.fill(dp[i],-1);
		  //  for(int j=0;j<m;j++){
		  //      arr[i][j]=sc.next().charAt(j);
		  //      if(arr[i][j]=='#')dp[i][j]=Integer.MIN_VALUE+2;
		  //  }
		}
	    for(int i=1;i<n;i++){
	        if(arr[i][0]=='#') break;
	        dp[i][0]=1;
	    }
	        
	    for(int i=1;i<m;i++){
	        if(arr[0][i]=='#') break;
	        dp[0][i]=1;
	    }
		for(int i=1;i<n;i++){
		    for(int j=1;j<m;j++){
		        if(arr[i][j]=='.')
		            dp[i][j]=(dp[i-1][j]<=0? 0 : dp[i-1][j])+(dp[i][j-1]<=0?0:dp[i][j-1]);
		        else 
		            dp[i][j]=-100;
		        dp[i][j]%=1000000007;
		    }
		}
		System.out.println(dp[n-1][m-1]);
		
	}
}
