import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
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
			while (hi - lo > 1e-8) {
				double mid = (lo + hi) / 2;
				int[][] g = new int[N + M + 2][N + M + 2];
				for (int i = 0; i < M; ++i) {
					g[0][i + 1] = 1;
				}
				for (int i = 0; i < N; ++i) {
					g[M + 1 + i][N + M + 1] = 1;
				}
				for (int i = 0; i < M; ++i) {
					for (int j = 0; j < N; ++j) {
						if (time[i][j] <= mid) {
							g[i + 1][M + 1 + j] = 1;
						}
					}
				}
				MaxFlow f = new MaxFlow(g);
				if (f.calc(0, N + M + 1) == M) {
					hi = mid;
				} else {
					lo = mid;
				}
			}
			System.out.printf("%.8f\n", hi);
		}
	}

	static class MaxFlow {

		int[][] g;
		int[][] res;

		MaxFlow(int[][] g) {
			this.g = g;
			this.res = new int[g.length][];
			for (int i = 0; i < g.length; ++i) {
				this.res[i] = g[i].clone();
			}
		}

		int calc(int src, int sink) {
			int result = 0;
			int[] prev = new int[g.length];
			while (true) {
				Arrays.fill(prev, -1);
				boolean[] visited = new boolean[g.length];
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(src);
				visited[src] = true;
				OUT: while (!q.isEmpty()) {
					int cur = q.poll();
					for (int i = 0; i < g.length; ++i) {
						if (!visited[i] && res[cur][i] > 0) {
							prev[i] = cur;
							visited[i] = true;
							if (i == sink) {
								break OUT;
							}
							q.add(i);
						}
					}
				}
				if (!visited[sink]) {
					break;
				}
				int pos = sink;
				int pathCap = Integer.MAX_VALUE;
				while (pos != src) {
					int p = prev[pos];
					pathCap = Math.min(pathCap, res[p][pos]);
					pos = p;
				}
				pos = sink;
				while (pos != src) {
					int p = prev[pos];
					res[p][pos] -= pathCap;
					res[pos][p] += pathCap;
					pos = p;
				}
				result += pathCap;
			}
			return result;
		}

	}
}