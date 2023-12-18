import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		long x;
		long y;

		if (n > k) {
			x = n % k;
			y = k - x;
		} else if (n == k) {
			x = 0;
			y = 0;
		} else {
			x = Math.abs(n - k);
			y = Math.abs(x - k);
		}

		System.out.println(Math.min(x, y));
		sc.close();

	}
}