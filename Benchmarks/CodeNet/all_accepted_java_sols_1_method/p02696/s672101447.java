

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();

		long ans = 0;
		long s = 0;

		if (n < b) {
			ans = (a * n) / b - a * (n / b);
		} else {
			long nb = n / b;

			if (n % b == b - 1) {
				s = (nb * b - 1);
				ans = (a * s) / b - a * (s / b);
			} else {
				s = ((nb - 1) * b - 1);
				ans = (a * s) / b - a * (s / b);
			}

			ans = Math.max(ans, a * (b - 1) / b);
		}

		System.out.println(ans);

	}

}
