import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static double[][] time;

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] xt = new int[N];
			int[] yt = new int[N];
			int[] vt = new int[N];
			int[] xb = new int[M];
			int[] yb = new int[M];
			for (int i = 0; i < N; ++i) {
				xt[i] = sc.nextInt();
				yt[i] = sc.nextInt();
				vt[i] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				xb[i] = sc.nextInt();
				yb[i] = sc.nextInt();
			}
			time = new double[M][N];
			for (int i = 0; i < M; ++i) {
				for (int j = 0; j < N; ++j) {
					time[i][j] = Math.sqrt((xb[i] - xt[j]) * (xb[i] - xt[j]) + (yb[i] - yt[j]) * (yb[i] - yt[j])) / vt[j];
				}
			}
			double lo = 0;
			double hi = 15000;
			while (hi - lo > 1e-6) {
				double mid = (lo + hi) / 2;
				BiMatching bm = new BiMatching(M, N);
				if (bm.matching(mid) == M) {
					hi = mid;
				} else {
					lo = mid;
				}
			}
			System.out.printf("%.8f\n", hi);
		}
	}

	static class BiMatching {
		int N, M;
		int[] l2r, r2l;

		BiMatching(int n, int m) {
			N = n;
			M = m;
			l2r = new int[n];
			r2l = new int[m];
			Arrays.fill(l2r, -1);
			Arrays.fill(r2l, -1);
		}

		int matching(double t) {
			int res = 0;
			boolean[] visited = new boolean[M];
			for (int i = 0; i < N; ++i) {
				if (l2r[i] != -1) continue;
				for (int j = 0; j < M; ++j) {
					if (time[i][j] <= t && dfs(j, visited, t)) {
						l2r[i] = j;
						r2l[j] = i;
						++res;
						break;
					}
				}
			}
			return res;
		}

		boolean dfs(int rn, boolean[] visited, double t) {
			int l = r2l[rn];
			if (l == -1) {
				return true;
			}
			visited[rn] = true;
			for (int r = 0; r < M; ++r) {
				if (time[l][r] > t || visited[r]) continue;
				if (dfs(r, visited, t)) {
					r2l[r] = l;
					l2r[l] = r;
					visited[rn] = false;
					return true;
				}
			}
			visited[rn] = false;
			return false;
		}
	}

}