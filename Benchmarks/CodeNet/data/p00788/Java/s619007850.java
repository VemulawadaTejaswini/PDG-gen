import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int p = sc.nextInt();
			int n = sc.nextInt();
			if ((p | n) == 0)
				break;
			double max = 0;
			double min = Double.POSITIVE_INFINITY;
			double rp = Math.sqrt(p);
			int max_a = 0;
			int max_b = 0;
			int min_a = 0;
			int min_b = 0;
			for (int i = 1; i <= n; i++) {
				int l = 1;
				int r = n;
				while (true) {
					int mid = (l + r) / 2;
					if (l == mid || r == mid)
						break;
					if (rp < 1.0 * mid / i) {
						r = mid;
					} else {
						l = mid;
					}
				}
				if (1.0 * l / i < rp) {
					if (max < 1.0 * l / i) {
						max = 1.0 * l / i;
						max_a = l;
						max_b = i;
					}
				}
				if (1.0 * r / i > rp)
					if (min > 1.0 * r / i) {
						min = 1.0 * r / i;
						min_a = r;
						min_b = i;
					}
			}
			System.out.println(min_a + "/" + min_b + " " + max_a + "/" + max_b);
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}