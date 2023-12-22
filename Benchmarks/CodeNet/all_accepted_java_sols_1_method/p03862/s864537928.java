import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		long ans = 0;
		if (a[0] + a[1] > x) {
			if (a[0] > x) {
				ans += a[0] - x;
				a[0] = x;
				ans += a[1];
				a[1] = 0;
			} else {
				long d = x - a[0];
				ans += a[1] - d;
				a[1] = d;
			}
		}
		for (int i = 2; i < n; i++) {
			if (a[i - 1] + a[i] > x) {
				long d = x - a[i - 1];
				ans += a[i] - d;
				a[i] = d;
			}
		}
		System.out.println(ans);
	}
}
