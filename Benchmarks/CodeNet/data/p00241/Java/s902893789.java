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
			while (N-- > 0) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int z1 = sc.nextInt();
				int w1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				int z2 = sc.nextInt();
				int w2 = sc.nextInt();

				int a0 = x1 * x2 - y1 * y2 - z1 * z2 - w1 * w2;
				int b0 = x1 * y2 + x2 * y1 - w1 * z2 + z1 * w2;
				int c0 = x1 * z2 + x2 * z1 + w1 * y2 - y1 * w2;
				int d0 = x1 * w2 + x2 * w1 - z1 * y2 + y1 * z2;
				System.out.println(a0 + " " + b0 + " " + c0 + " " + d0);
			}
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