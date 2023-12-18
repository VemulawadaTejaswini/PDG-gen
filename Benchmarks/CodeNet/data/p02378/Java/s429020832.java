import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int X, Y, E;
	static int[] x, y;
	static ArrayList<Integer>[] g;
	static boolean[] vis;
	static int[] matchTo;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		E = sc.nextInt();
		x = new int[E];
		y = new int[E];
		g = new ArrayList[X + Y];
		for (int i = 0; i < X + Y; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt() + X;
			g[x[i]].add(y[i]);
			g[y[i]].add(x[i]);
		}
		vis = new boolean[X + Y];
		matchTo = new int[X + Y];
		Arrays.fill(matchTo, -1);
		int match = 0;
		for (int i = 0; i < X; ++i) {
			Arrays.fill(vis, false);
			if (dfs(i))
				++match;
		}
		System.out.println(match);
	}

	static boolean dfs(int v) {
		if (v < 0)
			return true;
		for (int u : g[v]) {
			if (vis[u])
				continue;
			vis[u] = true;
			if (dfs(matchTo[u])) {
				matchTo[u] = v;
				matchTo[v] = u;
				return true;
			}
		}
		return false;
	}
}