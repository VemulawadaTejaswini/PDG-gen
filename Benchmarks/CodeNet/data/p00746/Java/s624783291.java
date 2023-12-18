import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}

			HashMap<Integer, Integer[]> hashMap = new HashMap<Integer, Integer[]>();
			Integer[] zero = { 0, 0 };
			hashMap.put(0, zero);
			int x_max = 0, x_min = 0, y_max = 0, y_min = 0;

			for (int i = 1; i < n; i++) {
				int base = nextInt();
				int x = hashMap.get(base)[0];
				int y = hashMap.get(base)[1];

				int direction = nextInt();
				switch (direction) {
				case 0:
					x--;
					break;
				case 1:
					y--;
					break;
				case 2:
					x++;
					break;
				case 3:
					y++;
					break;
				default:
					break;
				}
				Integer[] axis = { x, y };
				hashMap.put(i, axis);

				x_max = Math.max(x_max, x);
				x_min = Math.min(x_min, x);
				y_max = Math.max(y_max, y);
				y_min = Math.min(y_min, y);
			}

			int width = x_max - x_min + 1;
			int height = y_max - y_min + 1;

			System.out.println(width + " " + height);

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