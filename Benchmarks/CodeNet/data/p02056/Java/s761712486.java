import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Edge>> g = new ArrayList<>();

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		int[] C = new int[N];
		int[] J = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(sc.next()) - 1;
		}
		for (int i = 0; i < N; i++) {
			J[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			int U = Integer.parseInt(sc.next()) - 1;
			int V = Integer.parseInt(sc.next()) - 1;
			int T = Integer.parseInt(sc.next());
			g.get(U).add(new Edge(V, T));
			g.get(V).add(new Edge(U, T));
		}
		long[] dist = new long[N];
		Arrays.fill(dist, Long.MAX_VALUE / 2);
		dist[0] = 0;
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(0, 0));
		while (!q.isEmpty()) {
			Node n = q.poll();
			if (n.cost > dist[n.cur]) continue;
			for (Edge e : g.get(n.cur)) {
				long nc = n.cost + e.len;
				if (dist[e.to] > nc) {
					dist[e.to] = nc;
					q.add(new Node(e.to, nc));
				}
			}
		}
		long[] dist2 = new long[N];
		for (int i = 0; i < N; i++) {
			dist2[i] = dist[i] - P[i];
			q.add(new Node(i, dist2[i]));
		}
		while (!q.isEmpty()) {
			Node n = q.poll();
			if (n.cost > dist2[n.cur]) continue;
			for (Edge e : g.get(n.cur)) {
				long nc = n.cost + e.len;
				if (dist2[e.to] > nc) {
					dist2[e.to] = nc;
					q.add(new Node(e.to, nc));
				}
			}
		}
		long[] ans = new long[K];
		Arrays.fill(ans, Long.MIN_VALUE);
		for (int i = 0; i < N; i++) {
			ans[C[i]] = Math.max(ans[C[i]], J[i] - dist[i] - dist2[i]);
		}
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < K; i++) {
			writer.println(ans[i]);
		}
		writer.flush();
	}

	static class Node implements Comparable<Node> {
		int cur;
		long cost;

		public Node(int cur, long cost) {
			this.cur = cur;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return Long.compare(this.cost, o.cost);
		}
	}

	static class Edge {
		int to, len;

		public Edge(int to, int len) {
			this.to = to;
			this.len = len;
		}
	}
}

