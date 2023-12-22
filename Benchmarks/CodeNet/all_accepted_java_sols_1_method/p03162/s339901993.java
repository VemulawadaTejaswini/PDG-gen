import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		int[][] dp = new int[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				dp[i][j]=0;
			}
		}
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int i=1;i<n;i++)
		{
			dp[i][0] = a[i] + Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = b[i] + Math.max(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = c[i] + Math.max(dp[i-1][1], dp[i-1][0]);
		}
		int ans = 0;
		for(int i=0;i<3;i++) ans = Math.max(ans, dp[n-1][i]);
		System.out.print(ans);
	}
}
