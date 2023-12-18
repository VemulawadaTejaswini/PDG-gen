import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;
		x = Math.abs(x);
		if (x - k * d >= 0) {
			ans = x - k * d;
		} else {
			ans = x % d;
			k = (long)k - x / d;
			if (k % 2 == 1) {
				ans = Math.abs(d - ans);
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
