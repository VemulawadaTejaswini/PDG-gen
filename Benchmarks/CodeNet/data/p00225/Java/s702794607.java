import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int MAX = 'Z' - 'A' + 1;
	int n;
	int[] deg, vis;
	int[][] nei;

	boolean check() {
		for (int i = 0; i < MAX; i++) {
			if (vis[i] != 1) {
				return false;
			}
		}
		int cnt = 0;
		for (int i = 0; i < deg.length; i++) {
			if (deg[i] % 2 == 1) {
				cnt++;
			}
		}

		return cnt == 0;
	}

	void check2(int k) {
		if (vis[k] == 1) {
			return;
		}
		vis[k] = 1;
		for (int i = 0; i < MAX; i++) {
			if (nei[k][i] == 1) {
				check2(i);
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int s = 0;
			deg = new int[MAX];
			vis = new int[MAX];
			nei = new int[MAX][MAX];
			Arrays.fill(vis, 1);
			for (int i = 0; i < n; i++) {
				char[] c = sc.next().toCharArray();
				int u = c[0] - 'a';
				int v = c[c.length - 1] - 'a';
				deg[u]++;
				deg[v]++;
				nei[u][v] = nei[v][u] = 1;
				vis[u] = vis[v] = -1;
				s = u;
			}

			check2(s);
			if (check()) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}