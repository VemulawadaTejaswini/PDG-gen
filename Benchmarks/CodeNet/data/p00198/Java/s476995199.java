import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			Dice[] dice = new Dice[N];
			for (int i = 0; i < N; i++) {
				dice[i] = new Dice(sc.next(), sc.next(), sc.next(), sc.next(),
						sc.next(), sc.next());
			}
			int match = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					Dice diceNow = dice[i];
					Dice diceCmp = dice[j];
					for (int k = 0; k < 4; k++) {
						diceCmp.roll_back();
						for (int l = 0; l < 4; l++) {
							diceCmp.rotate_parallel();
							if (diceNow.coincide(diceCmp)) {
								match++;
							}
						}
					}
					diceCmp.roll_right();
					for (int l = 0; l < 4; l++) {
						diceCmp.rotate_parallel();
						if (diceNow.coincide(diceCmp)) {
							match++;
						}
					}
					diceCmp.roll_right();
					diceCmp.roll_right();
					for (int l = 0; l < 4; l++) {
						diceCmp.rotate_parallel();
						if (diceNow.coincide(diceCmp)) {
							match++;
						}
					}
				}
			}
			System.out.println(match);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Dice {
		String top;
		String front;
		String right;
		String back;
		String left;
		String reverse;

		public Dice(String top, String front, String right, String back,
				String left, String reverse) {
			super();
			this.top = top;
			this.front = front;
			this.right = right;
			this.back = back;
			this.left = left;
			this.reverse = reverse;
		}

		void disp() {
			System.out.print(this.top + " " + this.front + " " + this.right
					+ " " + this.back + " " + this.left + " " + this.reverse);
			System.out.println();
		}

		void rotate_parallel() {
			String tmp = this.back;
			this.back = this.right;
			this.right = this.front;
			this.front = this.left;
			this.left = tmp;
		}

		void roll_back() {
			String tmp = this.top;
			this.top = this.front;
			this.front = this.reverse;
			this.reverse = this.back;
			this.back = tmp;
		}

		void roll_front() {
			String tmp = this.top;
			this.top = this.back;
			this.back = this.reverse;
			this.reverse = this.front;
			this.front = tmp;
		}

		void roll_right() {
			String tmp = this.top;
			this.top = this.left;
			this.left = this.reverse;
			this.reverse = this.right;
			this.right = tmp;
		}

		void roll_left() {
			String tmp = this.top;
			this.top = this.right;
			this.right = this.reverse;
			this.reverse = this.left;
			this.left = tmp;
		}

		boolean coincide(Dice cmp) {
			if (this.front.equals(cmp.front) && this.top.equals(cmp.top)
					&& this.back.equals(cmp.back)
					&& this.right.equals(cmp.right)
					&& this.left.equals(cmp.left)
					&& this.reverse.equals(cmp.reverse)) {
				return true;
			} else {
				return false;
			}
		}
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