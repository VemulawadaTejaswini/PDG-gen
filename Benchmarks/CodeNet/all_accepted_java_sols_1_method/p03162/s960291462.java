import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] x = new int[n][3];
		for (int i = 0; i < n; i++) {
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();
			x[i][2] = sc.nextInt();
		}
		long[][] dp = new long[n][3];
		dp[n-1][0] = x[n-1][0]; dp[n-1][1] = x[n-1][1]; dp[n-1][2] = x[n-1][2];
		for (int i = n - 2; i >= 0; i--) {
			dp[i][0] = Math.max(dp[i+1][1], dp[i+1][2]) + x[i][0];
			dp[i][1] = Math.max(dp[i+1][0], dp[i+1][2]) + x[i][1];
			dp[i][2] = Math.max(dp[i+1][1], dp[i+1][0]) + x[i][2];
		}
		System.out.println(Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2])));
	}
}
