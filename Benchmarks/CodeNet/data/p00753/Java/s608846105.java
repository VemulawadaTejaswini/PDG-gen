import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}
			int lim = 2 * n;

			if (n == 1) {
				System.out.println(1);
				continue;
			} else if (n % 2 == 0) {
				n++;
			} else {
				n += 2;
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			while (n <= lim) {
				// nは必ず3以上の奇数
				boolean is_prime = true;
				for (int i = 1; 2 * i + 1 <= Math.sqrt(n); i++) {
					if (n % (2 * i + 1) == 0) {
						is_prime = false;
						break;
					}
				}
				if (is_prime) {
					list.add(n);
				}

				n += 2;
			}

			System.out.println(list.size());

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