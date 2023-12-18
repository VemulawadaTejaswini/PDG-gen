
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	boolean[] color;
	List<List<Edge>> adj = new ArrayList<List<Edge>>();
	int INF = 1 << 24;

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int f = scanner.nextInt();
				int s = scanner.nextInt();
				adj.get(v).add(new Edge(f, s));
			}
		}
		slove();
	}

	private void slove() {
		color = new boolean[n];
		int[] d = new int[n];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.add(new Edge(0, 0));
		Arrays.fill(d, INF);
		d[0] = 0;
		while (!pq.isEmpty()) {
			Edge f = pq.poll();
			int u = f.second;
			color[u] = true;
			if (d[u] < f.first)
				continue;
			for (int i = 0; i < adj.get(u).size(); i++) {
				int v = adj.get(u).get(i).first;
				if (color[v])
					continue;
				int a = adj.get(u).get(i).second;
				if (d[v] > d[u] + a) {
					d[v] = d[u] + a;
					pq.add(new Edge(d[v], v));
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", i, d[i]);
		}

	}

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