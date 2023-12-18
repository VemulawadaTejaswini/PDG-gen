import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };
	int  M = 10000000;

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				return;
			}
			int[][] cost = new int[n + 1][n + 1];
			int[] min = new int[n + 1];
			boolean[] use = new boolean[n + 1];

			for (int i = 0; i <= n; i++) {
				Arrays.fill(cost[i], M);
				cost[i][i] = 0;
			}
			Arrays.fill(min, M);
			for (int i = 0; i < m; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int c = sc.nextInt();
				cost[s][t] = c;
				cost[t][s] = c;
			}
			min[1] = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (;;) {
				int v = -1;
				for (int j = 1; j <= n; j++) {
					if (!use[j] && (v == -1 || min[v] > min[j])) {
						v = j;
					}
				}
				if (v == -1) {
					break;
				}
				if (min[v] != 0) {
					list.add(min[v]);
				}
				use[v] = true;
				for (int j = 1; j <= n; j++) {
					if (!use[j] && min[j] > cost[v][j]) {
						min[j] = cost[v][j];
					}
				}
			}
			Collections.sort(list);
			System.out.println(list.get((n-1)/2));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}