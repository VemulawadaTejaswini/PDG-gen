import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	class Edge {
		int from, to, cost, time;

		public Edge(int from, int to, int cost, int time) {
			// TODO 自動生成されたコンストラクター・スタブ
			this.from = from; this.to = to; this.cost = cost; this.time = time;
		}
	}
	int n, m;
	LinkedList<Edge> edges = new LinkedList<Edge>();

	void solve(int p, int q, int r) {
		int INF = Integer.MAX_VALUE;
		int[] d = new int[m + 1];	// 各駅への最短距離
		for(int i=0; i < d.length; i++)
			d[i] = INF;
		d[p] = 0;
		while(true) {
			boolean update = false;
			for(Edge e : edges) {
				if(d[e.from] != INF && d[e.to] > d[e.from] + (r == 0 ? e.cost : e.time)) {
					d[e.to] = d[e.from] + (r == 0 ? e.cost : e.time);
					update = true;
				}
			}
			if(!update) break;
		}
		System.out.println(d[q]);
	}

	void run() {
		Scanner scanner = new Scanner(System.in);
		// while(true) {
		n = scanner.nextInt();
		m = scanner.nextInt();
		if (n == 0 || m == 0)
			return;
		// if(n == 0 || m == 0)
		// break;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int cost = scanner.nextInt();
			int time = scanner.nextInt();
			Edge edge = new Edge(a, b, cost, time);
			edges.add(edge);
		}
		int k = scanner.nextInt();
		if (k == 0)
			return;
		for (int i = 0; i < k; i++) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			int r = scanner.nextInt();
			solve(p, q, r);
		}
		// }
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}

}