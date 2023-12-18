import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int q = sc.nextInt();
		// int[] w = new int[n];
		// for (int i = 0; i < n; ++i) {
		// w[i] = sc.nextInt();
		// }
		// HLDecomposition hl = new HLDecomposition(n);
		// ArrayList<Integer>[] g = new ArrayList[n];
		// for (int i = 0; i < n; ++i) {
		// int s = sc.nextInt() - 1;
		// int e = sc.nextInt() - 1;
		// hl.ae(s, e);
		// }
		// hl.pre();
		int n = sc.nextInt();
		HLDecomposition hl = new HLDecomposition(n);
		for (int i = 0; i < n; ++i) {
			int k = sc.nextInt();
			for (int j = 0; j < k; ++j) {
				int c = sc.nextInt();
				hl.ae(i, c);
			}
		}
		hl.pre();
		int q = sc.nextInt();
		for (int i = 0; i < q; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.println(hl.lca(u, v));
		}
	}

	class HLDecomposition {
		int n;
		int[] depth;
		int[] head;
		int[] heavy;
		int[] parent;
		int[] sz;// ??¨?????¨?????§??????
		ArrayList<Integer>[] g;
		int[] id;

		@SuppressWarnings("unchecked")
		public HLDecomposition(int n) {
			this.n = n;
			depth = new int[n];
			head = new int[n];
			heavy = new int[n];
			parent = new int[n];
			id = new int[n];
			sz = new int[n];
			g = new ArrayList[n];
			for (int i = 0; i < n; ++i) {
				g[i] = new ArrayList<>();
			}
			Arrays.fill(head, -1);
			Arrays.fill(id, -1);
			Arrays.fill(parent, -1);
		}

		void ae(int a, int b) {
			g[a].add(b);
			g[b].add(a);
		}

		void pre() {
			dfs(0, -1);
			bfs();
		}

		void bfs() {
			ArrayDeque<Integer> pend = new ArrayDeque<>();
			int gen = 0;
			pend.add(0);
			while (!pend.isEmpty()) {
				int v = pend.pollFirst();
				int top = v;
				for (; v != -1; v = heavy[v]) {
					id[v] = gen++;
					head[v] = top;
					for (int d : g[v]) {
						if (d == parent[v] || d == heavy[v]) {
							continue;
						}
						pend.add(d);
					}
				}
			}
		}

		int lca(int u, int v) {
			if (head[u] != head[v]) {
				if (depth[head[u]] < depth[head[v]]) {
					int tmp = u;
					u = v;
					v = tmp;
				}
				return lca(parent[head[u]], v);
			} else {
				if (depth[u] > depth[v]) {
					int tmp = u;
					u = v;
					v = tmp;
				}
				return u;
			}
		}

		int dfs(int c, int p) {
			parent[c] = p;
			int s = 1;
			int to = -1;
			for (int d : g[c]) {
				if (d == p)
					continue;
				depth[d] = depth[c] + 1;
				s += dfs(d, c);
				if (to == -1 || sz[d] > sz[to]) {
					to = d;
				}
			}
			sz[c] = s;
			heavy[c] = to;
			return s;
		}

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}