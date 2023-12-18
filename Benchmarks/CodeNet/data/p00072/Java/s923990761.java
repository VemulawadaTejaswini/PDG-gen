import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new aoj0072().doIt();
	}

	class aoj0072 {
		int cost[][];
		int mincost[];
		boolean used[];
		int V;

		int prim() {
			for (int i = 0; i < V; i++) {
				mincost[i] = Integer.MAX_VALUE;
				used[i] = false;
			}
			mincost[0] = 0;
			int res = 0;
			while (true) {
				int v = -1;
				for (int u = 0; u < V; u++) {
					if (!used[u] && (v == -1 || mincost[u] < mincost[v]))
						v = u;
				}
				if (v == -1)
					break;
				used[v] = true;
				res += mincost[v];

				for (int u = 0; u < V; u++) {
					mincost[u] = Math.min(mincost[u], cost[v][u]);
				}
			}
			return res;
		}

		void doIt() {
			while (true) {
				V = sc.nextInt();
				if (V == 0)
					break;
				cost = new int[V][V];
				mincost = new int[V];
				used = new boolean[V];
				for (int i = 0; i < V; i++) {
					for (int j = 0; j < V; j++) {
						cost[i][j] = Integer.MAX_VALUE;
					}
				}
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					String[] node = sc.next().split(",");
					int nodea = Integer.valueOf(node[0]);
					int nodeb = Integer.parseInt(node[1]);
					int abcost = Integer.parseInt(node[2]);
					cost[nodea][nodeb] = abcost;
				}
				int ans = prim();
				ans = (ans / 100) - V + 1;
				System.out.println(ans);
			}
		}
	}
}