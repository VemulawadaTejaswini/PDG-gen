import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long mod = 1000000007;

	long f(long m, long n) {
		if (n == 1) {
			return m;
		} else {
			return (f((m * m) % mod, n / 2) * (n % 2 == 1 ? m : 1)) % mod;
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long m = sc.nextLong();
		long n = sc.nextLong();

		sc.close();

		out.println(f(m, n));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

