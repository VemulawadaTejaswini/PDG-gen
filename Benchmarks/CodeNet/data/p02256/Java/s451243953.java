import java.util.Scanner;

public class Main {
	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String args[]) {
		long c;
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		c = gcd(a, b);
		System.out.println(c);

	}
}

