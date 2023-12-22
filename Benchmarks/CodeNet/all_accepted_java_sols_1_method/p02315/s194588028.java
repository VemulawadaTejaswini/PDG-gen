import java.util.Scanner;

/**
 * Combinatorial - 0-1 Knapsack Problem
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] vs = new int[N + 1];
		int[] ws = new int[N + 1];
		int[][] dp = new int[N + 1][W + 1];

		for (int i = 1; i <= N; i++) {
			vs[i] = sc.nextInt();
			ws[i] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j < ws[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - ws[i]] + vs[i]);
				}
			}
		}

		System.out.println(dp[N][W]);

	}
}