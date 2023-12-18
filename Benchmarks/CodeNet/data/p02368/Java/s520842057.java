import java.util.*;

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
		vis = new boolean[V];
		marked = new boolean[V];
		cmp = new int[V];
		low = new int[V];
		id = new int[V];
		for (int i = 0; i < V; ++i) {
			if (!marked[i]) {
				dfs(i);
			}
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			if (cmp[u] == cmp[v]) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	static ArrayDeque<Integer> stack = new ArrayDeque<>();
	static boolean[] vis;
	static int[] low;
	static int[] id;
	static int curId = 0;
	static boolean[] marked;
	static int[] cmp;
	static int col = 0;

	static void dfs(int cur) {
		vis[cur] = true;
		stack.addFirst(cur);
		id[cur] = curId++;
		low[cur] = id[cur];
		for (int dst : g[cur]) {
			if (marked[dst])
				continue;
			if (!vis[dst]) {
				dfs(dst);
				low[cur] = Math.min(low[cur], low[dst]);
			} else {
				low[cur] = Math.min(low[cur], id[dst]);
			}
		}
		if (id[cur] == low[cur]) {
			int v;
			do {
				v = stack.removeFirst();
				cmp[v] = col;
				marked[v] = true;
			} while (v != cur);
			++col;
		}
		return;
	}
}