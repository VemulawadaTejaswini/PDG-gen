import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		P[] p = new P[N];
		for (int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			p[i] = new P(a, b);
		}
		Arrays.sort(p);
		int[][] dp = new int[N + 1][N + 1];
		final int INF = 1 << 30;
		for (int[] a : dp) {
			Arrays.fill(a, INF);
		}
		dp[0][0] = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (dp[i][j] != INF) {
					dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
					if (dp[i][j] + p[i].a <= p[i].b) {
						dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + p[i].a);
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= N; ++i) {
			for (int j = 0; j <= N; ++j) {
				if (dp[i][j] != INF) {
					ans = Math.max(ans, j);
				}
			}
		}
		System.out.println(ans);
	}

	static class P implements Comparable<P> {
		int a, b;

		P(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int compareTo(P o) {
			return this.b - o.b;
		}
	}

}