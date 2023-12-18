import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long[][] dp = new long[n + 1][n + 1];

		for (int d = 1; d <= n; d++) {
			for (int l = 0; l <= n; l++) {
				int r = l + d;
				if (r > n) break;
				if ((n - d) % 2 == 0) {
					// maximize
					dp[l][r] = Math.max(dp[l + 1][r] + a[l], dp[l][r - 1] + a[r - 1]);
				} else {
					// minimize
					dp[l][r] = Math.min(dp[l + 1][r] - a[l], dp[l][r - 1] - a[r - 1]);
				}
			}
		}

		System.out.println(dp[0][n]);
	}
}
