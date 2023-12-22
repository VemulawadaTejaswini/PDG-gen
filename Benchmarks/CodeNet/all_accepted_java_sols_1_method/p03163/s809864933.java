import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int W = in.nextInt();
		int[] w = new int[n];
		long[] v = new long[n];
		for(int i=0;i<n;i++)
		{
			w[i] = in.nextInt();
			v[i] = in.nextLong();
		}
		long[][] dp = new long[n+1][W+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0 || j==0) dp[i][j] = 0;
				else if(j-w[i-1]>=0) dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]] + v[i-1]);
				else dp[i][j] = dp[i-1][j];
			}
		}
		long ans = 0;
		for(int i=0;i<=W;i++)
		{
			ans = Math.max(ans, dp[n][i]);
		}
		System.out.print(ans);
	}
}
