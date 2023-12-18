import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int L = sc.nextInt();
			if ((N | M | L) == 0)
				break;
			int es[][][] = new int[N][N][2];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Arrays.fill(es[i][j], INF);
				}

			}
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int d = sc.nextInt();
				int e = sc.nextInt();
				es[a][b][0] = d;
				es[a][b][1] = e;
				es[b][a][0] = d;
				es[b][a][1] = e;
			}
			Queue<Node> q = new PriorityQueue<Node>();
			q.add(new Node(0, L, 0));
			boolean visited[][] = new boolean[N][L + 1];
			while (!q.isEmpty()) {
				Node n = q.poll();
				int v = n.v;
				int d = n.money;
				int enemy = n.enemy;
				if (v == N - 1) {
					System.out.println(enemy);
					break;
				}
				if (visited[v][d])
					continue;
				visited[v][d] = true;
				for (int i = 0; i < N; i++) {
					if (es[v][i][0] >= INF)
						continue;
					if (d >= es[v][i][0]) {
						q.add(new Node(i, d - es[v][i][0], enemy));
					}
					q.add(new Node(i, d, enemy + es[v][i][1]));
				}
			}
		}
	}
}

class Node implements Comparable<Node> {
	int v;
	int money;
	int enemy;

	public Node(int v, int money, int enemy) {
		this.v = v;
		this.money = money;
		this.enemy = enemy;
	}

	@Override
	public int compareTo(Node o) {
		// TODO 自動生成されたメソッド・スタブ
		return this.enemy - o.enemy;
	}

}