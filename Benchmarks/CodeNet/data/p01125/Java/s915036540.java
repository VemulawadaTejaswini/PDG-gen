import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}

			int[][] jewels = new int[21][21];
			for (int i = 0; i < n; i++) {
				int px = nextInt();
				int py = nextInt();
				jewels[px][py] = 1;
			}

			int x = 10;
			int y = 10;

			int ope = nextInt();
			int obtained = 0;
			for (int i = 0; i < ope; i++) {
				char direction = nextChar();
				int length = nextInt();

				int dx = x;
				int dy = y;
				if (direction == 'N') {
					dy += length;
				} else if (direction == 'S') {
					dy -= length;
				} else if (direction == 'W') {
					dx -= length;
				} else if (direction == 'E') {
					dx += length;
				}

				if (dx == x) {
					int max = Math.max(y, dy);
					int min = Math.min(y, dy);
					for (int py = min; py <= max; py++) {
						if (jewels[x][py] != 0) {
							jewels[x][py] = 0;
							obtained++;
						}
					}

				} else {
					int max = Math.max(x, dx);
					int min = Math.min(x, dx);
					for (int px = min; px <= max; px++) {
						if (jewels[px][y] != 0) {
							jewels[px][y] = 0;
							obtained++;
						}
					}

				}

				x = dx;
				y = dy;

			}

			if (obtained == n) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
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

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}