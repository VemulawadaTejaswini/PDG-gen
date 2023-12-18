import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] p = new int[15];
	static int[] move = new int[15];

	static int solve() {
		int[][] dp = new int[N + 1][3];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(dp[i + 1], Integer.MAX_VALUE);
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < 3; ++j) {
				dp[i + 1][p[i]] = Math.min(dp[i + 1][p[i]], dp[i][j] + move[i] * Math.abs(j - p[i]));
			}
			if (p[i] == 1) {
				dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][0] + move[i] * 4 + 1);
				dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][1] + move[i] * 3 + 1);
				dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][2] + move[i] * 2 + 1);
				dp[i + 1][2] = Math.min(dp[i + 1][2], dp[i][2] + move[i] * 4 + 1);
				dp[i + 1][2] = Math.min(dp[i + 1][2], dp[i][1] + move[i] * 3 + 1);
				dp[i + 1][2] = Math.min(dp[i + 1][2], dp[i][0] + move[i] * 2 + 1);
			} else {
				dp[i + 1][1] = Math.min(dp[i + 1][1], dp[i][p[i]] + move[i] * 3 + 1);
				dp[i + 1][1] = Math.min(dp[i + 1][1], dp[i][1] + move[i] * 2 + 1);
				dp[i + 1][1] = Math.min(dp[i + 1][1], dp[i][2 - p[i]] + move[i] * 1 + 1);
				dp[i + 1][2 - p[i]] = Math.min(dp[i + 1][2 - p[i]], dp[i][p[i]] + move[i] * 6 + 2);
				dp[i + 1][2 - p[i]] = Math.min(dp[i + 1][2 - p[i]], dp[i][1] + move[i] * 5 + 2);
				dp[i + 1][2 - p[i]] = Math.min(dp[i + 1][2 - p[i]], dp[i][2 - p[i]] + move[i] * 4 + 2);
			}
		}
		int m = Math.min(dp[N][0], dp[N][2]);
		return m <= M ? m : -1;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 1; i < move.length; ++i) {
			move[i] = move[i - 1] * 3 + 1;
		}
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			for (int i = 0; i < 3; ++i) {
				int c = sc.nextInt();
				for (int j = 0; j < c; ++j) {
					p[N - sc.nextInt()] = i;
				}
			}
			System.out.println(solve());
		}
	}
}