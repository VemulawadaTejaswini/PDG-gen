import java.util.Scanner;

public class Main {
	int n, deep;
	int[] f;
	boolean[][] g;
	void run() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		g = new boolean[n][n];

		int m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			g[s][t] = g[t][s] = true;
		}

		f = new int[n];
		for (int i = 0; i < n; i++)
			f[i] = -1;

		int groupId = 0;
		for (int i = 0; i < n; i++)
			if (f[i] < 0)
				dfs(i, groupId++);
		
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			System.out.println(f[s] == f[t] ? "yes" : "no");
		}

	}
	void dfs(int u, int groupId) {
		if (f[u] != -1)
			return;

		f[u] = groupId;
		for (int i = 0; i < n; i++)
			if (g[u][i])
				dfs(i, groupId);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

