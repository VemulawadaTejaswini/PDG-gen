

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	int h[]=new int[n];
	for(int i=0;i<n;i++)
	{
		h[i]=scan.nextInt();
	}
	long dp[]=new long[n];
	Arrays.fill(dp,Long.MAX_VALUE);
	dp[0]=0;
	
	for(int i=1;i<n;i++)
	{
		//1 step to k steps
		long dist=-1;
		for(int cur=1;cur<=k;cur++) {
			if(i-cur<0)
			{
				break;
			}
			else {
			dp[i]=Math.min(Math.abs(h[i]-h[i-cur])+dp[i-cur],dp[i]);
			}
		}
//		System.out.println(dp[i]);
	}
	System.out.println(dp[n-1]);
	
}
}
