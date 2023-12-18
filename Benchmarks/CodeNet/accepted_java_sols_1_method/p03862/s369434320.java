import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		long ans = 0;
		if (a[0] > x) {
			ans += a[0] - x;
			a[0] -= ans;
		}
		for (int i = 1; i < n; i++) {
			long y = x - a[i - 1];
			if (a[i] > y) {
				long z = a[i] - y;
				ans += z;
				a[i] -= z;
			}
		}
		System.out.println(ans);
	}
}
