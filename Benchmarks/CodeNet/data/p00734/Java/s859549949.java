import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			int m = nextInt();

			if (n == 0) {
				break;
			}

			int[] taro = new int[101];
			int sum_taro = 0;
			for (int i = 0; i < n; i++) {
				int card = nextInt();
				sum_taro += card;
				taro[card]++;
			}

			int[] hanako = new int[101];
			int sum_hanako = 0;
			for (int i = 0; i < m; i++) {
				int card = nextInt();
				sum_hanako += card;
				hanako[card]++;
			}

			if (Math.abs(sum_hanako - sum_taro) % 2 != 0) {
				System.out.println(-1);
				continue;
			}

			for (int i = 0; i < 101; i++) {
				int diff = (sum_taro - sum_hanako) / 2;
				if (i - diff >= 0 && i - diff <= 100 && taro[i] > 0
						&& hanako[i - diff] > 0) {
					System.out.println(i + " " + (i - diff));
					break;
				}
				if (i == 100) {
					System.out.println(-1);
				}

			}

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