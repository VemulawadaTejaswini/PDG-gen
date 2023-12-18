import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();// the number of cities
			int m = sc.nextInt();// the number of roads
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			if (n == 0 && m == 0 && s == 0 && t == 0)
				break;
			ArrayList<Edge>[] g = new ArrayList[n];
			ArrayList<Edge>[] g_rev = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				g[i] = new ArrayList<>();
				g_rev[i] = new ArrayList<>();
			}
			int[] A = new int[m];
			int[] B = new int[m];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				A[i] = a;
				B[i] = b;
				g[a].add(new Edge(a, b, 1));
				g_rev[b].add(new Edge(b, a, 1));
			}
			Preflow_Relabel pr = new Preflow_Relabel(s, t, g);
			long tmp = pr.calc();
			boolean[] reachble_from_s = new boolean[n];
			boolean[] reachble_from_t = new boolean[n];
			ArrayDeque<Integer> S = new ArrayDeque<>();
			ArrayDeque<Integer> T = new ArrayDeque<>();
			S.add(s);
			T.add(t);
			while (!S.isEmpty()) {
				int v = S.poll();
				if (reachble_from_s[v]) {
					continue;
				}
				reachble_from_s[v] = true;
				for (Edge e : g[v]) {
					int u = e.dst;
					if (pr.residue(v, u) > 0)
						S.add(u);
				}
			}
			while (!T.isEmpty()) {
				int v = T.poll();
				if (reachble_from_t[v]) {
					continue;
				}
				reachble_from_t[v] = true;
				for (Edge e : g[v]) {
					int u = e.dst;
					if (pr.residue(u, v) > 0)
						T.add(u);
				}
			}
			for (int i = 0; i < m; i++) {
				if (reachble_from_s[B[i]] && reachble_from_t[A[i]]) {
					System.out.println((tmp + 1) + " " + (i + 1));
					return;
				}
			}
			System.out.println(tmp + " " + 0);
		}
	}

	class Preflow_Relabel {
		int n;
		int s;
		int t;
		ArrayList<Edge>[] g;
		int[][] flow;
		int[][] capacity;
		int[] excess;
		int[] height;
		ArrayDeque<Integer>[] B;

		void global_relabeling() {
			ArrayDeque<Integer> que = new ArrayDeque<>();
			boolean[] arrived = new boolean[n];
			que.add(t);
			while (!que.isEmpty()) {
				int v = que.poll();
				for (Edge e : g[v]) {
					if (residue(e.dst, v) > 0 && (height[v] + 1 < height[e.dst] || !arrived[e.dst])) {
						height[e.dst] = height[v] + 1;
						arrived[e.dst] = true;
					}
				}
			}
		}

		@SuppressWarnings("unchecked")
		public Preflow_Relabel(int s, int t, ArrayList<Edge>[] g) {
			this.g = g;
			this.s = s;
			this.t = t;
			n = g.length;
			flow = new int[n][n];
			capacity = new int[n][n];
			height = new int[n];
			height[s] = n;
			excess = new int[n];
			B = new ArrayDeque[n + 1];
			for (int i = 0; i <= n; i++) {
				B[i] = new ArrayDeque<>();
			}
			B[height[s]].add(s);

			for (int i = 0; i < n; i++) {
				for (Edge e : g[i]) {
					if (e.weight > 0) {
						g[e.dst].add(new Edge(e.dst, e.src, 0));
						capacity[e.src][e.dst] += e.weight;
					} else if (e.weight == 0) {
						continue;
					}
				}
			}
		}

		int b = 0;

		@SuppressWarnings("unchecked")
		int calc() {
			int count = 0;
			for (Edge e : g[s]) {
				excess[s] += e.weight;
				push(s, e.dst);
				B[height[e.dst]].add(e.dst);
			}
			global_relabeling();
			for (b = height[s]; b >= 0;) {
				if (B[b].isEmpty()) {
					b--;
					continue;
				}
				int v = B[b].poll();
				if (excess[v] == 0 || v == t || v == s || height[v] > n) {
					continue;
				}

				for (Edge e : g[v]) {
					if (height[e.src] == height[e.dst] + 1) {
						if (residue(e.src, e.dst) > 0) {
							push(e.src, e.dst);
							if (excess[v] == 0)
								break;
						}
					}
				}
				if (excess[v] > 0) {
					int min = 1 << 30;
					for (Edge e : g[v]) {
						if (residue(e.src, e.dst) > 0) {
							min = Math.min(min, height[e.dst]);
						}
					}
					height[v] = min + 1;
					if (height[v] < n) {
						B[height[v]].add(v);
						if (height[v] > b)
							b = height[v];
					}
				}
				if (++count % n == 0) {
					global_relabeling();
				}
			}
			return excess[t];
		}

		int residue(int s, int t) {
			return capacity[s][t] - flow[s][t];
		}

		void push(int u, int v) {
			int delta = Math.min(excess[u], residue(u, v));
			flow[u][v] += delta;
			flow[v][u] -= delta;
			excess[v] += delta;
			excess[u] -= delta;
			if (v != t && v != s && height[v] < n) {
				B[height[v]].add(v);
				if (b < height[v]) {
					b = height[v];
				}
			}
		}

	}

	class Edge {
		int src;
		int dst;
		int weight;

		Edge(int src, int dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}

}