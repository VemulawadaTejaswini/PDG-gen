import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int x = nextInt();
			if (x == 0) {
				break;
			}
			int y = nextInt();
			int s = nextInt();

			int max = 0;

			for (int i = 1; i <= 100; i++) {
				// iを片方の商品の税抜き価格として考える
				int a = i * (100 + x) / 100;// x税込価格
				int j = (s - a) * 100 / (100 + x) - 1;

				if (j <= 0) {
					break;
				}

				for (int j2 = j; j2 <= j + 3; j2++) {
					int b = j2 * (100 + x) / 100;
					if (a + b == s) {
						int ay = i * (100 + y) / 100;
						int by = j2 * (100 + y) / 100;
						max = Math.max(ay + by, max);
					}
				}

			}

			System.out.println(max);
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}