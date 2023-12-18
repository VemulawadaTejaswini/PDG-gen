import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		double[][] v = new double[M][N];
		double[][] len = new double[M + 1][M + 1];
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				v[i][j] = sc.nextDouble();
				len[M][i] += v[i][j] * v[i][j];
			}
		}
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {
				if (i == j) continue;
				double a = len[M][j];
				double b = 0;
				for (int k = 0; k < N; ++k) {
					b += v[i][k] * v[j][k];
				}
				double c = len[M][i];
				len[j][i] = a == 0 ? c : c - b * b / a;
			}
		}
		boolean[] visited = new boolean[M + 1];
		visited[M] = true;
		PriorityQueue<Edge> q = new PriorityQueue<Edge>();
		for (int i = 0; i < M; ++i) {
			q.add(new Edge(len[M][i], M, i));
		}
		double ans = 0;
		while (!q.isEmpty()) {
			Edge cur = q.poll();
			if (visited[cur.to]) continue;
			visited[cur.to] = true;
			ans += cur.len;
			for (int i = 0; i < M; ++i) {
				if (!visited[i]) q.add(new Edge(len[cur.to][i], cur.to, i));
			}
		}
		System.out.printf("%.7f\n", ans);
	}

	static class Edge implements Comparable<Edge> {
		double len;
		int from, to;

		public Edge(double len, int from, int to) {
			this.len = len;
			this.from = from;
			this.to = to;
		}

		public int compareTo(Edge o) {
			return Double.compare(this.len, o.len);
		}

	}

}