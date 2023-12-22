import java.util.*;


import java.io.*;
import java.math.BigInteger;


public class Main 
{   
	static int dp[];
	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		dp=new int[n];
		Arrays.fill(dp, -1);
		int ans=frog(ar,0,n);
		System.out.println(ans);
	}

	private static int frog(int[] ar, int i,int n) {
		// TODO Auto-generated method stub
		if(i>=n-1) {
			//System.out.println(1);
			return 0;

		}
		
		if(dp[i]!=-1)
			return dp[i];
		
		int op1=(i+1<n?Math.abs(ar[i]-ar[i+1])+frog(ar, i+1, n):Integer.MAX_VALUE);
		
		int op2=(i+2<n?Math.abs(ar[i]-ar[i+2])+frog(ar, i+2, n):Integer.MAX_VALUE);
		
		dp[i]= Math.min(op1, op2);
		
		return dp[i];
		
	}

}
