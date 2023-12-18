import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		for (;;) {
			int N = Integer.valueOf(sc2.nextLine()); 
			if (N == 0) {
				return;
			}
			String[][] info = new String[N][];
			for (int i = 0; i < N; i++) {
				info[i] = sc2.nextLine().split(" ");
			}
			Result[] res = new Result[N];
			for (int i = 0; i < N; i++) {
				int score = 0;
				int turn = 0;
				for (int j = 1; j < info[i].length; j++) {
					int pin = Integer.valueOf(info[i][j]);
					turn++;
					int add = 0;
					if (turn > 10) {
						break;
					}
					if (turn == 10) {
						for (int k = j; k < info[i].length; k++) {
							add += Integer.valueOf(info[i][k]);
						}

					} else if (j + 2 < info[i].length && pin == 10) {
						add += 10;
						add += Integer.valueOf(info[i][j + 1]);
						add += Integer.valueOf(info[i][j + 2]);
					} else if (pin + Integer.valueOf(info[i][j + 1]) == 10) {
						add += 10;
						add += Integer.valueOf(info[i][j + 2]);
						j++;
					} else {
						add += pin + Integer.valueOf(info[i][j + 1]);
						j++;
					}
					score += add;
				}
				res[i] = new Result(Integer.valueOf(info[i][0]), score);
			}
			Arrays.sort(res, new ComparatorResult());
			for (Result out : res) {
				System.out.println(out.id + " " + out.score);
			}
		}
	}

	class Result {
		int id;
		int score;

		public Result(int id, int score) {
			super();
			this.id = id;
			this.score = score;
		}
	}

	class ComparatorResult implements Comparator<Result> {
		@Override
		public int compare(Result arg0, Result arg1) {
			int cmp = -1;
			if (arg0.score < arg1.score) {
				cmp = 1;
			} else if (arg0.score == arg1.score) {
				if (arg0.id > arg1.score) {
					cmp = 1;
				} else {
					cmp = -1;
				}
			}
			return cmp;
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