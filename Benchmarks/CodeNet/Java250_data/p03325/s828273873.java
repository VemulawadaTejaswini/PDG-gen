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
			int ans = 0;

			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}

			for (int i = 0; i < n;) {
				if (a[i] % 2 == 0) {
					a[i] /= 2;
					ans++;
				} else {
					i++;
				}
			}

			System.out.println(ans);
		}
	}
}
