import java.util.*;

public class Main {
	static int r = 1000000000 + 7;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		long ans = 1, minus = 1;
		for (int i = 0; i < k; ++i) {
			ans *= (long) a[n - i - 1];
			ans %= r;
		}
		if ((long) a[0] * (long) a[n - 1] < 0) {
			long tmp = ans;
			for (int i = 2; i <= k; i += 2) {
				if (a[i - 2] != 0) {
					minus *= (long) a[i - 2];
					minus %= r;
				}
				if (a[i - 1] != 0) {
					minus *= (long) a[i - 1];
					minus %= r;
				}
				minus %= r;
				if (a[n - k + i - 2] != 0) {
					tmp /= (long) a[n - k + i - 2];
					tmp %= r;
				}
				if (a[n - k + i - 1] != 0) {
					tmp /= (long) a[n - k + i - 1];
					tmp %= r;
				}
				tmp *= minus;
				tmp %= r;
				ans = Math.max(tmp, ans);
			}
		}
		if (ans < 0) {
			ans += r;
		}
		System.out.println(ans);
	}
}
