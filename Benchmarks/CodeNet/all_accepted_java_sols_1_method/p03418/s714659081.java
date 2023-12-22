import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long ans = 0;
		sc.close();
		if (k != 0) {
			for (int i = k + 1; i <= n; ++i) {
				long tmpr = n % (long) i;
				long tmp = n / (long) i;
				ans += tmp * (long) (i - k);
				if (tmpr >= k)
					ans += tmpr - (long) k + 1;
			}
		} else
			ans = (long) n * (long) n;
		System.out.println(ans);
	}

}
