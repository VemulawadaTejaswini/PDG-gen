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
			int n = sc.nextInt();
			int l = sc.nextInt();
			if ((n | l) == 0) {
				return;
			}
			Ant[] ant = new Ant[n];
			for (int i = 0; i < n; i++) {
				ant[i] = new Ant(i + 1, sc.next(), sc.nextDouble(), false);
			}
			int cnt = 0;
			int last = 0;
			double time = 0;
			double tmp = 0;
			while (cnt != n) {
				for (int i = 0; i < n; i++) {
					if (!ant[i].leave) {
						if (ant[i].dir.equals("R")) {
							ant[i].dis += 0.5;
						} else {
							ant[i].dis -= 0.5;
						}
					}
				}

				for (int i = 0; i < n; i++) {
					for (int j = i + 1; j < n; j++) {
						if (ant[i].leave || ant[j].leave) {
							continue;
						}
						if (ant[i].dis == ant[j].dis) {
							if (ant[i].dis * 10 % 10 != 5) {
								if (ant[i].dir.equals("R")) {
									ant[i].dir = "L";
								} else {
									ant[i].dir = "R";
								}
								if (ant[j].dir.equals("R")) {
									ant[j].dir = "L";
								} else {
									ant[j].dir = "R";
								}
							}
						}
					}
				}
				tmp = 0;
				for (int i = 0; i < n; i++) {
					if (!ant[i].leave && (ant[i].dis == 0 || ant[i].dis == l)) {
						ant[i].leave = true;
						cnt++;
						if (time == tmp && ant[i].dir.equals("L")) {
							last = ant[i].num;
						} else if (tmp == 0) {
							last = ant[i].num;
						}
						tmp = time;
					}
				}
				time += 0.5;
			}
			System.out.println((int) time + " " + last);
		}
	}

	class Ant {
		int num;
		String dir;
		double dis;
		boolean leave;

		public Ant(int num, String dir, double dis, boolean leave) {
			super();
			this.num = num;
			this.dir = dir;
			this.dis = dis;
			this.leave = leave;
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