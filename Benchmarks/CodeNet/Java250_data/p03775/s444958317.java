import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private TreeSet<Long> divisors(long n) {
		TreeSet<Long> result = new TreeSet<>();

		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				result.add(i);
				result.add(n / i);
			}
		}

		return result;
	}

	private int keta(long x) {
		if (x == 0) {
			return 1;
		}
		int keta = 1;
		while (x >= 10) {
			x /= 10;
			keta++;
		}
		return keta;
	}

	private int F(long a, long b) {
		return Math.max(keta(a), keta(b));
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();

		sc.close();

		TreeSet<Long> s = divisors(N);

		int ans = Integer.MAX_VALUE;

		for (long a : s) {
			long b = N / a;
			ans = Math.min(ans, F(a, b));
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
