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
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			list.add(A[i]);
			list.add(B[i]);
		}
		list.sort(null);
		for (int i = 0; i < list.size(); i++) {
			while (i + 1 < list.size() && list.get(i) == list.get(i + 1))
				list.remove(i + 1);
		}
		ArrayList<Edge>[] g = new ArrayList[N + list.size() + 2];
		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < N; i++) {
			g[i].add(new Edge(i, list.indexOf(A[i]) + N, 1, -A[i]));
			if (A[i] != B[i]) {
				g[i].add(new Edge(i, list.indexOf(B[i]) + N, 1, -B[i]));
			}
			g[list.size() + N].add(new Edge(list.size() + N, i, 1, 0));
		}
		for (int i = 0; i < list.size(); i++) {
			g[i + N].add(new Edge(i + N, list.size() + N + 1, 1, 0));
		}

		System.out.println(min_cost_flow(N + list.size(), N + list.size() + 1, g));

	}

	// ?????????????????´????????£????????????????????????????????????????¨?
	int min_cost_flow(int s, int t, ArrayList<Edge>[] g) {
		boolean negative_cycle = false;
		int n = g.length;
		int min_cost = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < g[i].size(); j++) {
				Edge e = g[i].get(j);
				g[e.src].get(j).rev_id = g[e.dst].size();
				g[e.dst].add(new Edge(e.dst, e.src, 0, -e.cost));
				g[e.dst].get(g[e.src].size() - 1).rev_id = j;
			}
		}
		g[s].add(new Edge(s, t, 1 << 30, 0));
		g[t].add(new Edge(t, s, 1 << 30, 0));
		g[s].get(g[s].size() - 1).rev_id = g[t].size() - 1;
		g[t].get(g[t].size() - 1).rev_id = g[s].size() - 1;

		do {
			negative_cycle = false;
			int[] pre_v = new int[n];
			int[] pre_e = new int[n];
			int[] dist = new int[n];
			Arrays.fill(pre_v, -1);
			Arrays.fill(pre_e, -1);
			Arrays.fill(dist, 1 << 30);
			dist[s] = 0;
			ArrayDeque<Pair> que = new ArrayDeque<>();
			que.add(new Pair(s, 0));
			while (!que.isEmpty()) {
				Pair p = que.peek();
				if (p.time == n) {
					negative_cycle = true;
					break;
				} else
					que.poll();
				for (int i = 0; i < g[p.id].size(); i++) {
					Edge e = g[p.id].get(i);
					if (e.residue > 0) {
						if (dist[e.dst] > dist[e.src] + e.cost) {
							dist[e.dst] = dist[e.src] + e.cost;
							que.add(new Pair(e.dst, ++p.time));
							pre_v[e.dst] = e.src;
							pre_e[e.dst] = i;
						}
					}
				}
			}
			if (!negative_cycle)
				break;
			int v = que.poll().id;
			for (int i = 0; i < n; i++) {
				v = pre_v[v];
			}

			int i = v;
			int delta = 1 << 30;
			do {
				delta = Math.min(delta, g[pre_v[i]].get(pre_e[i]).residue);
				i = pre_v[i];
			} while (i != v);

			do {
				Edge e = g[pre_v[i]].get(pre_e[i]);
				e.add_flow(delta);
				g[i].get(e.rev_id).add_flow(-delta);
				min_cost += delta * e.cost;
				i = pre_v[i];
			} while (i != v);
		} while (true);

		return min_cost;

	}

	class Pair {
		int id;
		int time;

		Pair(int id, int time) {
			this.id = id;
			this.time = time;
		}
	}

	class Edge {
		int src;
		int dst;
		int cap;
		int cost;
		int residue;
		int flow = 0;
		int rev_id = -1;

		Edge(int src, int dst, int cap, int cost) {
			this.src = src;
			this.dst = dst;
			this.cap = cap;
			this.cost = cost;
			residue = cap - flow;
		}

		void add_flow(int flow) {
			this.flow += flow;
			residue = cap - this.flow;
		}
	}
}