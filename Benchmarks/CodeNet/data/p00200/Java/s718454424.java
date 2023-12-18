import java.util.LinkedList;
import java.util.Scanner;

public class TravelingAlone {
	class Main {
		int from, to, cost, time;

		public Edge(int from, int to, int cost, int time) {
			// TODO 自動生成されたコンストラクター・スタブ
			this.from = from;
			this.to = to;
			this.cost = cost;
			this.time = time;
		}
	}

	int n, m;
	LinkedList<Edge> edges;

	void solve(int p, int q, int r) {
		int INF = Integer.MAX_VALUE;
		int[] d = new int[m + 1]; // 各駅への最短距離
		for (int i = 0; i < d.length; i++)
			d[i] = INF / 2;
		d[p] = 0;
		while (true) {
			boolean update = false;
			for (Edge e : edges) {
				if (d[e.from] != INF
						&& d[e.to] > d[e.from] + (r == 0 ? e.cost : e.time)) {
					d[e.to] = d[e.from] + (r == 0 ? e.cost : e.time);
					update = true;
				}
			}
			if (!update)
				break;
		}
		System.out.println(d[q]);
	}
	
	int[][] warshall_floyd(int r) {
		int INF = Integer.MAX_VALUE / 2;
		int[][] d = new int[m+1][m+1];
		for(int i=0; i < d.length; i++)
			for(int j=0; j < d[0].length; j++)
				d[i][j] = INF;
		for(Edge e : edges)
			d[e.from][e.to] = (r == 0 ? e.cost : e.time);
		
		for(int k=1; k < m+1; k++)
			for(int i=1; i < m+1; i++)
				for(int j=1; j < m+1; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
		
		return d;
	}

	void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if (n == 0 || m == 0)
				break;
			edges = new LinkedList<Edge>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int cost = scanner.nextInt();
				int time = scanner.nextInt();
				edges.add(new Edge(a, b, cost, time));
				edges.add(new Edge(b, a, cost, time));
			}
			int k = scanner.nextInt();
			if (k == 0)
				return;
			int[][][] d = new int[2][][];
			d[0] = warshall_floyd(0);
			d[1] = warshall_floyd(1);
			for (int i = 0; i < k; i++) {
				int p = scanner.nextInt();
				int q = scanner.nextInt();
				int r = scanner.nextInt();
				System.out.println(d[r][p][q]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}

}