import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		int gram[] = new int[5001];
		Arrays.fill(gram, Integer.MAX_VALUE);
		int cnt = 0;
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 48; j++) {
				for (int k = 0; k <= 10; k++) {
					int sum = i * 200 + j * 300 + k * 500;
					if (sum <= 5000) {
						double add = 0;
						int base = i / 5;
						int mod = i % 5;
						add = (380 * base * 5 * 0.8) + 380 * mod;

						base = j / 4;
						mod = j % 4;
						add += (550 * base * 4 * 0.85) + 550 * mod;
						base = k / 3;
						mod = k % 3;
						add += (850 * base * 3 * 0.88) + 850 * mod;
						gram[sum] = (int) Math.min(gram[sum], add);
					}
				}
			}
		}
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			System.out.println(gram[n]);
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