import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int[][] r;
	int[][] map, cnt;

	class Dice {
		int top;
		int front, right, left, back;
		int bottom;

		Dice(int top, int front) {
			this.top = top;
			this.front = front;
			this.back = 7 - front;
			this.bottom = 7 - top;
		}

		void toBack() {
			int tmp = back;
			this.back = this.top;
			this.top = this.front;
			this.front = this.bottom;
			this.bottom = tmp;
		}

		void toRoght() {
			int tmp = this.right;
			this.right = this.top;
			this.top = this.left;
			this.left = this.bottom;
			this.bottom = tmp;
		}

		void toFront() {
			toBack();
			toBack();
			toBack();
		}

		void toLeft() {
			toRoght();
			toRoght();
			toRoght();
		}
	}

	void init() {
		r = new int[7][7];
		r[1][2] = 3;
		r[1][3] = 5;
		r[1][4] = 2;
		r[1][5] = 4;
		r[2][1] = 4;
		r[2][3] = 1;
		r[2][4] = 6;
		r[2][6] = 3;
		r[3][1] = 2;
		r[3][2] = 6;
		r[3][5] = 1;
		r[3][6] = 5;
		r[4][1] = 5;
		r[4][2] = 1;
		r[4][5] = 6;
		r[4][6] = 2;
		r[5][1] = 3;
		r[5][3] = 6;
		r[5][4] = 1;
		r[5][6] = 4;
		r[6][2] = 4;
		r[6][3] = 2;
		r[6][4] = 5;
		r[6][5] = 3;
	}

	void run() {
		MyScanner sc = new MyScanner();

		init();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int MAP = 5;
			map = new int[MAP][MAP];
			cnt = new int[MAP][MAP];
			for (int i = 0; i < n; i++) {
				int t = sc.nextInt();
				int f = sc.nextInt();
				Dice d = new Dice(t, f);
				d.right = r[t][f];
				d.left = 7 - d.right;

				int x = MAP / 2;
				int y = MAP / 2;
				while (true) {
					int flag = -1;
					int max = -1;
					if (4 <= d.front && cnt[y][x] > cnt[y + 1][x]) {
						flag = 1;
						max = d.front;
					}
					if (4 <= d.right && cnt[y][x] > cnt[y][x + 1] && max < d.right) {
						flag = 2;
						max = d.right;
					}
					if (4 <= d.left && cnt[y][x] > cnt[y][x - 1] && max < d.left) {
						flag = 3;
						max = d.left;
					}
					if (4 <= d.back && cnt[y][x] > cnt[y - 1][x] && max < d.back) {
						flag = 4;
						max = d.back;
					}

					if (flag < 0) {
						break;
					} else {
						if (flag == 1) {
							d.toFront();
							y++;
						} else if (flag == 2) {
							d.toRoght();
							x++;
						} else if (flag == 3) {
							d.toLeft();
							x--;
						} else {
							d.toBack();
							y--;
						}
					}
				}
				cnt[y][x]++;
				map[y][x] = d.top;
			}

			int[] ans = new int[7];
			for (int i = 0; i < MAP; i++) {
				for (int j = 0; j < MAP; j++) {
					ans[map[i][j]]++;
				}
			}
			String tab = "";
			for (int i = 1; i < 7; i++) {
				System.out.print(tab + ans[i]);
				tab = " ";
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}