import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			int A = nextInt();
			int B = nextInt();
			int C = nextInt();
			int X = nextInt();

			int[] Y = new int[N];
			for (int i = 0; i < Y.length; i++) {
				Y[i] = nextInt();
			}

			int k = 0;
			for (int i = 0; i < 10002; i++) {
				if (i == 10001) {
					System.out.println(-1);
					break;
				}

				if (Y[k] == X) {
					k++;
				}
				if (k == Y.length) {
					System.out.println(i);
					break;
				}

				X = (A * X + B) % C;

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