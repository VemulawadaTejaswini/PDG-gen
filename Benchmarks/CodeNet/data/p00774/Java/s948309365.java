import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		for (;;) {
			int H = sc.nextInt();
			if (H == 0) {
				return;
			}
			int[][] input = new int[5][H];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < 5; j++) {
					input[j][i] = sc.nextInt();
				}
			}
			@SuppressWarnings("unchecked")
			ArrayList<Integer>[] list = new ArrayList[5];
			for (int i = 0; i < 5; i++) {
				list[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < H; j++) {
					list[i].add(input[i][H - 1 - j]);
				}
			}
			int score = 0;
			boolean go = true;
			while (go) {
				go = false;
				for (int i = H; i >= 0; i--) {
					for (int j = 0; j < 5; j++) {
						int start = j;
						int cnt = 0;
						while (j + 1 < 5 && list[j].size() > i
								&& list[j + 1].size() > i
								&& list[j].get(i) == list[j + 1].get(i)) {
							j++;
							cnt++;
						}
						if (cnt >= 2) {
							int add = list[start].get(i) * (cnt + 1);
							score += add;
							for (int k = start; k <= start + cnt; k++) {
								list[k].remove(i);
							}
							go = true;
						}
					}
				}
			}
			System.out.println(score);
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