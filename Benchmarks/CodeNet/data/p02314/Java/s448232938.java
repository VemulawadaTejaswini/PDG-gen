package aoj.library.DPL.DPL_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Combinatorial - Coin Changing Problem
 */
public class Main {

	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;


		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cs = new int[m];
		int[] dp = new int[n + 1];


		for (int i = 0; i < m; i++) {
			cs[i] = sc.nextInt();
		}

		Arrays.fill(dp, INF);
		dp[0] = 0;

		for (int i = 0; i < m; i++) {
			for (int j = cs[i]; j <= n; j++) {
				dp[j] = Math.min(dp[j], dp[j - cs[i]] + 1);
			}
		}

		System.out.println(dp[n]);
	}
}