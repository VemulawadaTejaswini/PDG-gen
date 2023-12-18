import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int limit, N, M, X;
	static int[][] dp;

	public static void main(String[] args) throws Exception {
		while (true) {
			limit = sc.nextInt();
			N = sc.nextInt();
			M = sc.nextInt();
			X = sc.nextInt();
			if (N == 0) break;
			int[] SE = new int[N];
			int[] SS = new int[N];
			int[] NE = new int[M];
			int[] NS = new int[M];
			for (int i = 0; i < N; ++i) {
				String name = sc.next();
				SE[i] = sc.nextInt();
				SS[i] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				String name = sc.next();
				NE[i] = sc.nextInt();
				NS[i] = sc.nextInt();
			}
			dp = new int[limit + 1][M + 1];
			for (int i = 0; i < dp.length; ++i) {
				Arrays.fill(dp[i], -1);
			}
			dp[limit][0] = 0;
			for (int i = 0; i < M; ++i) {
				for (int j = i; j >= 0; --j) {
					for (int k = 0; k <= limit - NE[i]; ++k) {
						if (dp[k + NE[i]][j] != -1) {
							dp[k][j + 1] = Math.max(dp[k][j + 1], dp[k + NE[i]][j] + NS[i]);
						}
					}
				}
			}
//			for (int i = limit; i >= 0; --i) {
//				System.out.println(Arrays.toString(dp[i]));
//			}
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				ans = Math.max(ans, maxSat(SE[i], SS[i]));
			}
			for (int i = 0; i < N; ++i) {
				for (int j = i + 1; j < N; ++j) {
					ans = Math.max(ans, maxSat(SE[i] + SE[j], SS[i] + SS[j]));
				}
			}
			System.out.println(ans);
		}
	}

	static int maxSat(int additionalCost, int additionalSat) {
		int max = 0;
		for (int i = additionalCost; i <= limit; ++i) {
			for (int j = X; j <= M; ++j) {
//				System.out.println("i:" + i + " j:" + j + " val:" + dp[i][j]);
				max = Math.max(max, dp[i][j]);
			}
		}
//		System.out.println(additionalCost + " " + additionalSat + " " + max);
		return max + additionalSat;
	}
}