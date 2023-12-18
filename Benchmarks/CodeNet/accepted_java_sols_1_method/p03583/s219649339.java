import java.util.Scanner;

public class Main {

	private static final int VAL_LIMIT = 3500 + 1;

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int N = in.nextInt();

			int h0 = N / 4 + 1;
			for (int h = h0; h < VAL_LIMIT; ++h) {
				long a = (h << 2) - N;
				long b = N * h;
				int n0 = (int)(b / a + 1);
				for (int n = n0; n < VAL_LIMIT; ++n) {
					long c = a * n - b;
					long d = b * n;
					long w = d / c;
					if (w * c == d) {
						System.out.printf("%d %d %d%n", h, n, w);
						return;
					}
				}
			}
		}
	}
}
