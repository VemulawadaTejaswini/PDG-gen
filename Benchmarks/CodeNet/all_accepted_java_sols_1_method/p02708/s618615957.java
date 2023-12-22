

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
		long mod = 1000000007;

		for (long i = k; i <= n + 1; i++) {

			ans += ((n - i + 1) * i + 1) % mod;
			ans = ans % mod;
		}

		System.out.println(ans);
	}

}
