import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			// }
			// 1行目 ビルの数ｎ（整数）
			// 2行目 第1のビル情報 b1 x1 y1（それぞれ整数；半角空白区切り）
			// b1：ビル番号
			// x1：ビルのx座標
			// y1：ビルのy座標
			// 3行目 第2のビル情報 b2 x2 y2（それぞれ整数；半角空白区切り）
			// ：
			// n+1行目 第nのビル情報 bn xn yn（それぞれ整数；半角空白区切り）
			Point[] bs = new Point[n + 1];
			for (int i = 1; i <= n; i++) {
				int b = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				bs[b] = new Point(x, y);
			}
			@SuppressWarnings("unchecked")
			ArrayList<Edge> es[] = new ArrayList[n + 1];
			for (int i = 1; i <= n; i++) {
				es[i] = new ArrayList<Edge>();
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j)
						continue;
					int dis = (bs[i].x - bs[j].x) * (bs[i].x - bs[j].x)
							+ (bs[i].y - bs[j].y) * (bs[i].y - bs[j].y);
					if (dis <= 2500)
						es[i].add(new Edge(j, dis));
				}
			}
			// for (int i = 1; i <= n; i++) {
			// System.out.print(i + " : ");
			// System.out.println(es[i]);
			// }
			int m = sc.nextInt();
			int prev[] = new int[n + 1];
			for (int i = 0; i < m; i++) {
				int d[] = new int[n + 1];
				Arrays.fill(d, INF);
				Queue<Pair> q = new PriorityQueue<Pair>();
				int s = sc.nextInt();
				d[s] = 0;
				int g = sc.nextInt();
				q.offer(new Pair(0, s));
				while (!q.isEmpty()) {
					Pair p = q.poll();
					int v = p.v;
					if (d[v] < p.d)
						continue;
					for (int j = 0; j < es[v].size(); j++) {
						Edge e = es[v].get(j);
						if (d[e.to] > d[v] + e.cost) {
							prev[e.to] = v;
							d[e.to] = d[v] + e.cost;
							q.offer(new Pair(d[e.to], e.to));
						}
					}
				}
				if (d[g] == INF) {
					System.out.println("NA");

				} else {
					boolean init = true;
					int j = g;
					Stack<String> ans = new Stack<String>();
					while (true) {
						if (init) {
							init = false;
						} else {
							ans.add(" ");
						}
						ans.add(Integer.toString(j));
						if (j == s) {
							break;
						}
						j = prev[j];
					}
					while (!ans.isEmpty()) {
						System.out.print(ans.pop());
					}
					System.out.println();
				}
			}
			// n+2行目 移動情報の個数m（整数）
			// n+3行目 第1 の移動情報 s1 g1（それぞれ整数；半角空白区切り）
			// s1 スパイダー人の移動開始ビル番号
			// g1 スパイダー人の目的地ビル番号
			// n+4行目 第2 の移動情報 s2 g2（それぞれ整数；半角空白区切り）
			// ：
			// n+m+2行目 第m の移動情報 sm gm（それぞれ整数；半角空白区切り）
		}
	}
}

class Edge {
	public int to;
	public int cost;

	Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	public String toString() {
		return "to: " + to + " cost: " + cost;
	}
}

class Pair implements Comparable<Pair> {
	int d;
	int v;

	Pair(int d, int v) {
		this.d = d;
		this.v = v;
	}

	@Override
	public int compareTo(Pair p) {
		if (d - p.d < 0)
			return -1;
		else if (d - p.d > 0)
			return 1;
		else
			return 0;
	}
}