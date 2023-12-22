import java.util.*;

public class Main {
	static double[] arr;
	static double[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new double[n + 1];
		dp = new double[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextDouble();
		}
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j] * (1 - arr[i]);
				} else {
					dp[i][j] = dp[i - 1][j] * (1 - arr[i]) + dp[i - 1][j - 1] * arr[i];
				}
			}
		}
		double ans = 0;
		for (int i = n / 2 + 1; i <= n; i++) {
			ans += dp[n][i];
		}
		System.out.println(ans);
	}

}
