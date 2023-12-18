import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n = nextInt();
		int m = nextInt();

		Treasure[] treasure = new Treasure[n];

		for (int i = 0; i < n; i++) {
			treasure[i] = new Treasure(nextInt(), nextInt());
		}

		Arrays.sort(treasure);

		for (int q = 0; q < m; q++) {
			int count = 0;
			int x1 = nextInt();
			int y1 = nextInt();
			int x2 = nextInt();
			int y2 = nextInt();

			for (int i = 0; i < treasure.length; i++) {
				if (treasure[i].x < x1) {
					continue;
				}
				for (int k = i; k < treasure.length; k++) {
					if (treasure[k].x > x2) {
						break;
					}
					if (treasure[k].y >= y1 && treasure[k].y <= y2) {
						count++;
					}
				}
				break;
			}
			System.out.println(count);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}

class Treasure implements Comparable<Treasure> {
	int x = 0;
	int y = 0;

	public Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(Treasure t1) {
		return this.x - t1.x;
	}
}