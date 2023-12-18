import java.util.Scanner;

public class Main {

	static long solve(long x, long k, long d) {
		x = Math.abs(x);
		long q = x / d;
		long r = x % d;
		if (q >= k)
			return x - d * k;
		long remaining = k - q;
		if (remaining % 2 == 0)
			return r;
		else
			return d - r;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long x, k, d;

		x = stdIn.nextLong();
		k = stdIn.nextLong();
		d = stdIn.nextLong();
		System.out.println(solve(x, k, d));

		stdIn.close();
	}
}
