import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		int D = sc.nextInt();
		boolean first = true;
		while (D-- > 0) {
			if (!first) {
				System.out.println();
			}
			first = false;
			int n = sc.nextInt();
			char[][] field = new char[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(field[i], ' ');
			}
			for (int i = 0; i < n; i++) {
				field[i][0] = '#';
				field[0][i] = '#';
			}
			if (n < 3) {
				debug2(field);
			} else if (n == 3) {
				for (int i = 0; i < n; i++) {
					field[i][n - 1] = '#';
				}
				debug2(field);
			} else {
				for (int i = 0; i < n; i++) {
					field[i][n - 1] = '#';
				}
				int nowX = n - 1;
				int nowY = n - 1;
				boolean go = true;
				while (go) {
					go = false;
					while (nowX - 2 >= 0 && field[nowY - 1][nowX - 1] != '#'
							&& field[nowY][nowX - 2] != '#'
							&& field[nowY][nowX - 1] != '#') {
						field[nowY][--nowX] = '#';
						go = true;
					}
					while (nowY - 2 >= 0 && field[nowY - 1][nowX + 1] != '#'
							&& field[nowY - 2][nowX] != '#'
							&& field[nowY - 1][nowX] != '#') {
						field[--nowY][nowX] = '#';
						go = true;
					}
					while (nowX + 2 < n && field[nowY + 1][nowX + 1] != '#'
							&& field[nowY][nowX + 2] != '#'
							&& field[nowY][nowX + 1] != '#') {
						field[nowY][++nowX] = '#';
						go = true;
					}
					while (nowY + 2 < n && field[nowY + 1][nowX - 1] != '#'
							&& field[nowY + 2][nowX] != '#'
							&& field[nowY + 1][nowX] != '#') {
						field[++nowY][nowX] = '#';
						go = true;
					}
				}
				debug2(field);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(new String(array[i]));
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