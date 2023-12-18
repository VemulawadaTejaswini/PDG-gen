import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		sc.close();

		x = Math.abs(x);
		if (x / d >= k) {
			System.out.println(x - k * d);
		} else {
			long k2 = x / d;
			long x2 = x - k2 * d;
			long k3 = k - k2;
			k3 %= 2;
			x2 -= k3 * d;
			System.out.println(Math.abs(x2));
		}
	}
}
