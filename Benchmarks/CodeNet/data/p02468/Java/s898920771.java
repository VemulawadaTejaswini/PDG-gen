import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long m = scan.nextLong();
		long n = scan.nextLong();

		System.out.println(run(m, n, (long) 1000000007));
		scan.close();
		System.exit(0);
	}

	private static long run(long m, long n, long M) {
		long result = 1;
		for (long i = 1; i <= n; i++) {
			result *= m;
			if (result >= M) {
				result = result % M;
				result = run(result, (long) n / i, (long) 1000000007);
				i = n - (n % i);
			}
		}
		return result;
	}
}