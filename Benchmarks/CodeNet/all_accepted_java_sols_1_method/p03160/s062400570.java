import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=scan.nextInt();

		int dp[]=new int[n];
		dp[1]=Math.abs(ar[1]-ar[0]);

		for(int i=2;i<n;i++)
		{
			int min = Math.min(dp[i-1]+Math.abs(ar[i]-ar[i-1]), dp[i-2]+Math.abs(ar[i]-ar[i-2]));
			dp[i] = min;
		}
		System.out.println(dp[n-1]);
	}
}