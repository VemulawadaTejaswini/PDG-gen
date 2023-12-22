import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		solve(is);
	}

	private static void solve(InputStream is) {
		try (Scanner cin = new Scanner(is)) {
			int n = cin.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = cin.nextInt();
			}

			int ans = 0;
			int candy = 0;

			for (int x = 0; x < n; x++) {
				for (int i = 0; i <= x; i++) {
					candy += a[i];
				}
				for (int i = x; i < n; i++) {
					candy += b[i];
				}
				ans = ans > candy ? ans : candy;
				candy = 0;
			}

			System.out.println(ans);
		}
	}
}