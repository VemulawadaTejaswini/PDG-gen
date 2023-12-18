
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Pair[] p = new Pair[n];
		for (int i = 0; i < n; i++)
			p[i] = new Pair(scanner.nextInt(), scanner.nextInt());
		Arrays.sort(p);
		int ans = 1 << 25;
		for (int i = 1; i < n - 1; i++)
			for (int j = i; j >= 0; j--) {
				int dx = p[i + 1].x - p[j].x;
				int dy = p[i + 1].y - p[j].y;
				if (dx * dx >= ans)
					break;
				ans = Math.min(ans, dx * dx + dy * dy);
			}
		System.out.println(ans);
	}

	class Pair implements Comparable<Pair> {
		int x, y;

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			return x - o.x;
		}

	}
}