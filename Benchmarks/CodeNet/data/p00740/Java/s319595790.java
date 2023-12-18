import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			int r = nextInt();

			if (n == 0) {
				break;
			}

			int[] stone = new int[n];
			int position = 0;
			int can = r;
			while (true) {
				if (can == 0) {
					can = stone[position];
					stone[position] = 0;
				} else {
					can--;
					stone[position]++;
				}

				if (stone[position] == r) {
					break;
				}

				position++;
				if (position == n) {
					position = 0;
				}
			}
			System.out.println(position);

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