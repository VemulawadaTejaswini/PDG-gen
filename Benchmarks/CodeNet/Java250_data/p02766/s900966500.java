import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			int k = sc.nextInt();
			final String base36 = Integer.toString(n, k);
			System.out.println(base36.length());
		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}
