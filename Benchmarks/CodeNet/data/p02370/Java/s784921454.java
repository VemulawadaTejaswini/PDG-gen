import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int V;
	static int E;
	static ArrayList<Integer>[] g;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		g = new ArrayList[V];
		for (int i = 0; i < V; ++i)
			g[i] = new ArrayList<>();

		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}

		ord = new int[V];
		vis = new boolean[V];
		pending = new boolean[V];

		sort();

		for (int i = 0; i < V; ++i) {
			System.out.println(ord[i]);
		}
	}

	static int[] ord;
	static boolean[] vis;
	static boolean[] pending;
	static int now = 0;

	static void sort() {
		for (int i = 0; i < V; ++i) {
			if (!vis[i])
				dfs(i, -1);
		}
	}

	static void dfs(int cur, int pre) {
		for (int to : g[cur]) {
			if (to != pre && !vis[to]) {
				if (pending[to])
					throw new AssertionError();
				dfs(to, cur);
			}
		}
		ord[V - now - 1] = cur;
		vis[cur] = true;
		++now;
	}
}