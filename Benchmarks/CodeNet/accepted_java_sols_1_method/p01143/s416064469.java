import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt(), m = s.nextInt(), p = s.nextInt();
			if (n < 1) {
				break;
			}

			int a = 0, c = 0;
			for (int i = 0; i < n; ++i) {
				int b = s.nextInt();
				a += b;
				if (i + 1 == m) {
					c = b;
				}
			}
			System.out.println(c < 1 ? 0 : 100 * a * (100 - p) / 100 / c);

		}
	}
}