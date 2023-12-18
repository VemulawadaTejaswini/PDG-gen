
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			m = scanner.nextInt();
			e = new Edge[n];
			for (int i = 0; i < m; i++) {
				StringTokenizer t = new StringTokenizer(scanner.next(), ",");
				int from = Integer.parseInt(t.nextToken());
				int to = Integer.parseInt(t.nextToken());
				int cost = Integer.parseInt(t.nextToken()) / 100 - 1;
				e[i] = new Edge(from, to, cost);
			}
			System.out.println(kruskal());
		}
	}

	private int kruskal() {
		Arrays.sort(e);
		int ans = 0;
		Union union = new Union(n);
		for (int i = 0; i < m; i++) {
			Edge edge = e[i];
			if (union.isSame(edge.from, edge.to))
				continue;
			ans += edge.cost;
			union.unit(edge.from, edge.to);
		}

		return ans;
	}

	int n, m;
	Edge[] e;

	class Union {
		int[] par, rank;

		public Union(int n) {
			par = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++)
				par[i] = i;
		}

		int find(int x) {
			if (par[x] == x)
				return x;
			return par[x] = find(par[x]);

		}

		boolean isSame(int x, int y) {
			return find(x) == find(y);
		}

		void unit(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y)
				return;
			if (rank[x] < rank[y])
				par[x] = y;
			else {
				par[y] = x;
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}
	}

	class Edge implements Comparable<Edge> {
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return cost - o.cost;
		}

	}
}