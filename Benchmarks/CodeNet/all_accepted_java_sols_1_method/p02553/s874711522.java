import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long x = a * c;
		long y = a * d;
		long z = b * c;
		long w = b * d;
		long max = Math.max(x, Math.max(y, Math.max(z, w)));

		if (a <= 0 && 0 <= b) {
			max = Math.max(max, 0);
		}

		if (c <= 0 && 0 <= d) {
			max = Math.max(max, 0);
		}

		System.out.println(max);

		sc.close();

	}
}
