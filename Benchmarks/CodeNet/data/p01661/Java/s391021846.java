import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static long[][] W;

	public static void main(String[] args) {
		long INF = 1L << 50;
		N = sc.nextInt();
		int S = sc.nextInt() - 1;
		Star[] stars = new Star[N + 1];
		for (int i = 0; i < N; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			stars[i] = new Star(l, r, i);
		}
		stars[N] = new Star(0, 0, N);
		W = new long[N + 1][N + 1];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				W[i][j] = Integer.parseInt(sc.next());
			}
		}
		for (int i = 0; i < N; ++i) {
			W[N][i] = W[S][i];
			W[i][N] = INF;
		}
		long[][] dist = new long[N + 1][N + 1];
		for (long[] a : dist) {
			Arrays.fill(a, INF);
		}
		for (int i = 0; i <= N; ++i) {
			for (int j = 0; j <= N; ++j) {
				dist[i][j] = W[i][j];
			}
		}
		for (int i = 0; i <= N; ++i) {
			for (int j = 0; j <= N; ++j) {
				for (int k = 0; k <= N; ++k) {
					if (dist[j][k] > dist[j][i] + dist[i][k]) dist[j][k] = dist[j][i] + dist[i][k];
				}
			}
		}
		Arrays.sort(stars);
		long[] dp = new long[N + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		long ans = 0;
		for (int i = 1; i <= N; ++i) {
			for (int j = 0; j < i; ++j) {
				if (dp[j] == -1) continue;
				long arrival = stars[j].r + dist[stars[j].idx][stars[i].idx];
				if (arrival > stars[i].r) continue;
				long add = stars[i].r - Math.max(stars[i].l, arrival);
				dp[i] = Math.max(dp[i], dp[j] + add);
			}
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}

	static class Star implements Comparable<Star> {
		int l, r, idx;

		public Star(int l, int r, int idx) {
			this.l = l;
			this.r = r;
			this.idx = idx;
		}

		public int compareTo(Star o) {
			return this.r - o.r;
		}
	}
}