import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long countA = 0;
		long countB = 0;

		long tmp = c * d / euclid(c, d);

		countA = a - a / c - a / d + a / tmp;
		countB = b - b / c - b / d + b / tmp;

		System.out.println(countB - countA);
	}

	public static long euclid(long n, long m) {
		if(m==0) return n;
		return euclid(m, n%m);
	}
}