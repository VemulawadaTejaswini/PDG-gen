import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int n = nextInt();
		int m = nextInt();

		ArrayList<Treasure> list = new ArrayList<Treasure>();
		for (int i = 0; i < n; i++) {
			list.add(new Treasure(nextInt(), nextInt()));
		}
		Collections.sort(list);

		for (int i = 0; i < m; i++) {
			int t = 0;
			int x1 = nextInt();
			int y1 = nextInt();
			int x2 = nextInt();
			int y2 = nextInt();

			for (Treasure treasure : list) {
				if (treasure.x >= x1 && treasure.y >= y1 && treasure.x <= x2 && treasure.y <= y2) {
					t++;
				} else if (treasure.x > x2) {
					break;
				}
			}
			System.out.println(t);

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
	int x, y;

	public Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(Treasure o) {
		return this.x - o.x;
	}
}