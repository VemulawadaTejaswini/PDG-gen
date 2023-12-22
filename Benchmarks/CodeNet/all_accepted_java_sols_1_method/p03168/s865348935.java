import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] p = new double[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextDouble();
		}

		double[][] dp = new double[n + 1][n + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				dp[i][j] += dp[i - 1][j] * (1.0 - p[i - 1]);
				if (j > 0) dp[i][j] += dp[i - 1][j - 1] * p[i - 1];
			}
		}

		double a = 0.0;
		for (int i = n / 2 + 1; i <= n; i++) {
			a += dp[n][i];
		}
	
		System.out.println(a);
	}
}
