import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] c = new int[n][n];
		int[] excess = new int[n];
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		// 658160->6581650->
		int[][] u = new int[n][n];
		for (int src = 0; src < n; ++src) {
			int k = sc.nextInt();
			if (src != 0) {
				g[src].add(0);// ?§????0????????????0???????????????
				u[src][0] = 999999;
			}
			for (int i = 0; i < k; ++i) {
				int dst = sc.nextInt();
				--dst;
				int cost = sc.nextInt();
				c[src][dst] = cost;
				c[dst][src] = -cost;
				g[src].add(dst);
				g[dst].add(src);
				u[src][dst] = 999999;
				--excess[src];
				++excess[dst];
			}
		}

		solve(n, excess, g, c, u);
	}

	void solve(int n, int[] excess, ArrayList<Integer>[] g, int[][] c, int[][] u) {
		int[][] f = new int[n][n];
		int s = 0;
		for (int src = 0; src < n; ++src) {
			for (int dst : g[src]) {
				if (c[src][dst] > 0)
					s += c[src][dst];
			}
		}
		System.out.println(minCostFlow(n, u, f, c, g, excess) + s);
	}

	int minCostFlow(int n, int[][] u, int[][] f, int[][] c, ArrayList<Integer>[] g, int[] excess) {
		long[] p = new long[n];
		out: for (int i = 0; i < n; ++i) {
			if (excess[i] <= 0) {
				if (i == n - 1)
					break out;
				else
					continue out;
			}
			long[] d = new long[n];
			int[] pre = new int[n];
			Arrays.fill(pre, -1);
			Arrays.fill(d, Integer.MAX_VALUE / 16);
			d[i] = 0;
			class P implements Comparable<P> {
				int id;
				long d;

				public P(int id, long d) {
					this.id = id;
					this.d = d;
				}

				public int compareTo(P o) {
					return Long.compare(d, o.d);
				};
			}
			PriorityQueue<P> pq = new PriorityQueue<>();
			pq.add(new P(i, 0));
			while (!pq.isEmpty()) {
				P v = pq.poll();
				if (d[v.id] < v.d)
					continue;
				for (int dst : g[v.id]) {
					if (u[v.id][dst] - f[v.id][dst] <= 0)
						continue;
					if (c[v.id][dst] - (p[v.id] - p[dst]) + d[v.id] < d[dst]) {
						d[dst] = c[v.id][dst] - (p[v.id] - p[dst]) + d[v.id];
						pq.add(new P(dst, d[dst]));
						pre[dst] = v.id;
					}
				}
			}
			for (int j = 0; j < n; ++j) {
				if (excess[j] >= 0)
					continue;
				int ep = Math.min(excess[i], -excess[j]);
				for (int k = j; pre[k] != -1; k = pre[k]) {
					ep = Math.min(ep, u[pre[k]][k] - f[pre[k]][k]);
				}
				for (int k = j; pre[k] != -1; k = pre[k]) {
					f[pre[k]][k] += ep;
					f[k][pre[k]] -= ep;
				}
				excess[i] -= ep;
				excess[j] += ep;
				break;
			}

			for (int o = 0; o < n; ++o) {
				for (int l = 0; l < n; ++l) {
					if (o == l)
						continue;
					if (!(u[o][l] - f[o][l] > 0))
						continue;
					if (d[l] - d[o] - (c[o][l] - (p[o] - p[l])) > 0)
						tr(d[l] - d[o] - (c[o][l] - (p[o] - p[l])));// ?????????
				}
			}
			for (int j = 0; j < n; ++j) {
				p[j] -= d[j];
			}
			i = -1;
		}
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (u[i][j] > 0)
					ans += c[i][j] * f[i][j];
			}
		}
		return ans;
	}

	// ?°??´??????¨????????????????????????????????????
	void check(int[][] c, long[] p, int[][] u, int[][] f, int n) {
		for (int i = 0; i 8< n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (!(u[i][j] - f[i][j] > 0))
					continue;
				if (c[i][j] - (p[i] - p[j]) < 0) {
					tr("p", p);
					throw new AssertionError();
				}
			}
		}
		System.out.println("OK");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}