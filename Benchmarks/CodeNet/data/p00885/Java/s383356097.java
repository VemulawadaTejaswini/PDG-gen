import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] P = new int[42];
	static int[] T = new int[42];

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			for (int i = 0; i < N; ++i) {
				P[i + 1] = sc.nextInt();
				T[i + 1] = sc.nextInt();
			}
			P[N + 1] = 0;
			T[N + 1] = 200000;
			System.out.println(solve());
		}
	}

	static String solve() {
		int[][] dp = new int[N + 2][4];
		int INF = 1 << 28;
		for (int[] a : dp) {
			Arrays.fill(a, INF);
		}
		dp[0][0] = 0;
		for (int i = 1; i <= N + 1; ++i) {
			boolean ok = false;
			for (int j = 0; j < 4; ++j) {
				if (dp[i - 1][j] == INF) continue;
				ok = true;
				if (j != 3 && Math.abs(P[i] - P[i - 1]) * (j + 1) <= T[i] - T[i - 1]) {
					dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i - 1][j] + Math.abs(P[i] - P[i - 1]));
				}
				if (P[i - 1] * (j + 1) + P[i] <= T[i] - T[i - 1]) {
					dp[i][1] = Math.min(dp[i][1], dp[i - 1][j] + P[i - 1] + P[i]);
				}
			}
			if (!ok) {
				return "NG " + (i - 1);
			}
		}
		int min = INF;
		for (int i = 0; i < 4; ++i) {
			min = Math.min(min, dp[N + 1][i]);
		}
		return "OK " + min;
	}
}