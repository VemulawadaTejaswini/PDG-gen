
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			d = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					d[i][j] = scanner.nextInt();
			int max = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					d[i][j] = Math.max(d[i][j], d[j][i]);
					max = Math.max(max, d[i][j]);
				}
			ans = INF;
			used = new boolean[n];
			pos = new int[n];
			for (int i = max; i < 10000; i++)
				if (dfs(0, i)) {
					ans = i;
					break;
				}
			System.out.println(ans);
		}
	}

	private boolean dfs(int right, int depth) {
		if (right > depth)
			return false;
		int a = 0, b = 0;
		int[] na = new int[n], nb = new int[n];
		for (int i = 0; i < n; i++)
			if (!used[i])
				na[a++] = i;
			else
				nb[b++] = i;

		if (a == 0) {
			return true;
		}
		for (int i = 0; i < a; i++) {
			int u = na[i];
			for (int j = 0; j < b; j++) {
				int v = nb[j];
				pos[u] = Math.max(pos[u], pos[v] + d[v][u]);
			}
			used[u] = true;
			if (dfs(pos[u], depth))
				return true;
			used[u] = false;
			pos[u] = 0;
		}
		return false;
	}

	int n, ans;
	int[] pos;
	int[][] d;
	int INF = 1 << 30;
	boolean[] used;
}