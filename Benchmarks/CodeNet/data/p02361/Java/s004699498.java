import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
	private static final int INF = (int)1e9;

	static class Pair {
		int first;
		int second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}

		@Override
		public int hashCode() {
			return first + second;
		}

		@Override
		public boolean equals(Object other) {
			if (other instanceof Pair) {
				Pair p = (Pair)other;

				return p.first == first && p.second == second;
			}
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			List<Integer>[] g = new ArrayList[n];
			for (int i = 0; i < n; i++)
				g[i] = new ArrayList<>();

			int m = in.nextInt();
			int r = in.nextInt();
			Map<Pair, Integer> dist = new HashMap<>();
			for (int i = 0; i < m; i++) {
				int f = in.nextInt();
				int t = in.nextInt();
				int w = in.nextInt();

				g[f].add(t);
				dist.put(new Pair(f, t), w);
			}

			dijkstra(g, n, dist, r);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void dijkstra(List<Integer> g[], int n, Map<Pair, Integer> dist, int s) {
		int[] d = new int[n];
		for (int i = 0; i < n; i++)
			d[i] = INF;

		d[s] = 0;
		PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.second-y.second);
		pq.add(new Pair(s, 0));

		while (!pq.isEmpty()) {
			Pair p = pq.remove();

			for (int v : g[p.first]) {
				int dd = d[p.first] + dist.get(new Pair(p.first, v));
				if (dd < d[v]) {
					d[v] = dd;
					pq.add(new Pair(v, d[v]));
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (d[i] == INF)
				System.out.println("INF");
			else
				System.out.println(d[i]);
		}
	}
}