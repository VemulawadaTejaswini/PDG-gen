
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import lombok.Data;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	boolean[] color;
	int INF = 1 << 24;
	List<List<Edge>> adj = new ArrayList<List<Edge>>();

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				int c = scanner.nextInt();
				adj.get(u).add(new Edge(v,c));
			}
		}
		dijkstra();
	}

	private void dijkstra() {
		PriorityQueue<Edge> pq = new PriorityQueue<Main.Edge>();
		color = new boolean[n];
		int[] d = new int[n];
		Arrays.fill(d, INF);
		d[0] = 0;
		pq.add(new Edge(0, 0));
		while (!pq.isEmpty()) {
			Edge f = pq.poll();
			int u = f.second;
			color[u] = true;
			if (d[u] < f.first)
				continue;
			for (int j = 0; j < adj.get(u).size(); j++) {
				int v = adj.get(u).get(j).first;
				if (color[v])
					continue;
				if (d[v] > d[u] + adj.get(u).get(j).second) {
					d[v] = d[u] + adj.get(u).get(j).second;
					pq.add(new Edge(d[v], v));
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", i, d[i] == INF ? -1 : d[i]);
		}

	}
	@Data
	class Edge implements Comparable<Edge> {
		int first;
		int second;

		public Edge(int first, int second) {
			super();
			this.first = first;
			this.second = second;
		}

		@Override
		public int compareTo(Edge o) {
			return this.first - o.first;
		}

	}
}