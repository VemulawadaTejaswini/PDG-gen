import java.util.Arrays;

public class Main {

	Scanner in = new Scanner();

	class Scanner {
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

	void run() {
		int a[] = new int[1000000];
		for (;;) {
			int n = in.nextInt();
			if (n == 0)
				break;
			Arrays.fill(a, Integer.MAX_VALUE);
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			Arrays.sort(a);
			int cnt = 1;
			int x = a[0];
			boolean judge = true;
			for (int i = 1; i < n; i++) {
				if (x == a[i])
					cnt++;
				else {
					if (cnt > n / 2) {
						System.out.println(x);
						judge = false;
						break;
					}
					x = a[i];
					cnt = 1;
				}
			}
			if (judge & cnt > n / 2)
				System.out.println(x);
			else
				System.out.println("NO COLOR");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}