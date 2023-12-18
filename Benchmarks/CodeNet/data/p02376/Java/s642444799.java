import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//suppose that every capacity is in the domaion of integer.
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
		for (int i = 0; i < V; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int c = sc.nextInt();
			g[u].add(new Edge(u, v, c));
		}
		Preflow_Relabel pr = new Preflow_Relabel(0, V - 1, g);
		System.out.println(pr.calc());
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
		PriorityQueue<Vertice> que = new PriorityQueue<>();

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
			excess[s] = 1 << 30;

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

		int calc() {
			for (Edge e : g[s]) {
				excess[s] += e.weight;
				push(s, e.dst);
			}
			while (!que.isEmpty()) {
				Vertice v = que.poll();
				if (excess[v.id] == 0 || v.id == t || height[v.id] != v.height)
					continue;
				for (Edge e : g[v.id]) {
					if (height[e.src] == height[e.dst] + 1) {
						if (residue(e.src, e.dst) > 0) {
							push(e.src, e.dst);
							if (excess[v.id] == 0)
								break;
						}
					}
				}
				if (excess[v.id] > 0) {
					int min = 1 << 30;
					for (Edge e : g[v.id]) {
						if (residue(e.src, e.dst) > 0) {
							min = Math.min(min, height[e.dst]);
						}
					}
					height[v.id] = min + 1;
					que.add(new Vertice(v.id, height[v.id]));
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
			if (v != t) {
				que.add(new Vertice(v,height[v]));
			}
		}

		class Vertice implements Comparable<Vertice> {
			int id;
			int height;

			public Vertice(int id, int height) {
				this.id = id;
				this.height = height;
			}

			@Override
			public int compareTo(Vertice o) {
				return -Integer.compare(this.height, o.height);
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

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}