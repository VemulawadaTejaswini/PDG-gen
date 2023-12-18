import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt();
			if (n < 1) {
				break;
			}
			int w = s.nextInt(), h = s.nextInt();
			boolean[][] b = new boolean[w][h];

			for (; n-- > 0;) {
				b[s.nextInt() - 1][s.nextInt() - 1] = true;
			}

			int x = s.nextInt(), y = s.nextInt(), max = 0;
			for (int i = 0; i <= w - x; ++i) {
				for (int j = 0; j <= h - y; ++j) {
					int count = 0;
					for (int r = i; r < i + x; ++r) {
						for (int c = j; c < j + y; ++c) {
							count += b[r][c] ? 1 : 0;
						}
					}
					max = Math.max(max, count);
				}
			}
			System.out.println(max);
		}
	}
}