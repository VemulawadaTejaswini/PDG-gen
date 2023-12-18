
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Edge>[] g = new ArrayList[V];
		for (int i = 0; i < V; i++)
			g[i] = new ArrayList<>();
		for (int i = 0; i < E; i++) {
			int v = sc.nextInt();
			int u = sc.nextInt();
			int c = sc.nextInt();
			g[v].add(new Edge(v, u, c));
		}
		Edmonds_Kerp_MaxFlow mf = new Edmonds_Kerp_MaxFlow(0, V - 1, g);
		System.out.println(mf.MaxFlow());
	}

	class Edmonds_Kerp_MaxFlow {
		int n;
		int s;
		int t;
		ArrayList<Edge>[] g;
		int[][] flow;
		int[][] capacity;

		@SuppressWarnings("unchecked")
		public Edmonds_Kerp_MaxFlow(int s, int t, ArrayList<Edge>[] g) {
			this.g = g;
			this.s = s;
			this.t = t;
			n = g.length;
			flow = new int[n][n];
			capacity = new int[n][n];

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

		@SuppressWarnings("unchecked")
		int MaxFlow() {
			int total = 0;
			while (true) {
				int[] prev = bfs();
				if (prev[t] == -1)
					return total;
				int inc = 1 << 30;
				for (int i = t; prev[i] != -1; i = prev[i]) {
					inc = Math.min(inc, residue(prev[i], i));
				}
				for (int i = t; prev[i] != -1; i = prev[i]) {
					push(prev[i], i, inc);
				}
				total += inc;
			}
		}

		int residue(int s, int t) {
			return capacity[s][t] - flow[s][t];
		}

		int[] bfs() {
			int[] prev = new int[n];
			Arrays.fill(prev, -1);
			ArrayDeque<Integer> que = new ArrayDeque<>();
			que.add(s);
			out: while (!que.isEmpty()) {
				int v = que.poll();
				for (Edge e : g[v]) {
					if (prev[e.dst] == -1 && e.dst != s && residue(v, e.dst) > 0) {
						prev[e.dst] = v;
						que.add(e.dst);
						if (e.dst == t)
							break out;
					}
				}
			}
			return prev;
		}

		void push(int s, int t, int inc) {
			flow[s][t] += inc;
			flow[t][s] -= inc;
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

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}