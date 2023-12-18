import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		for (;;) {
			int n = in.nextInt();
			if (n == 0)
				return;
			System.gc();
			Map<Integer, Integer> HM = new HashMap<Integer, Integer>();
			boolean judge = false;
			for (int i = 0; i < n; i++) {
				int str = in.nextInt();
				if (HM.containsKey(str))
					HM.put(str, HM.get(str) + 1);
				else
					HM.put(str, 1);
			}
			for (Entry<Integer, Integer> entry : HM.entrySet()) {
				if (entry.getValue() > n / 2) {
					System.out.println(entry.getKey());
					judge = true;
					break;
				}
			}
			if (!judge) {
				System.out.println("NO COLOR");
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	static public void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}