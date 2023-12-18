import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int p, q, a, n;
	static long ans = 0;

	public static void main(String[] args) {
		while (true) {
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if (p == 0) break;
			System.out.println(solve());
		}
	}

	static long solve() {
		ans = 0;
		dfs(new Rational(p, q), 1, 0, 1);
		return ans;
	}

	static void dfs(Rational cur, long mul, int depth, long prev) {
		if (cur.num == 0) {
			++ans;
			return;
		}
		if (depth == n) {
			return;
		}
		for (long i = prev; mul * i <= a; ++i) {
			Rational next = cur.sub(new Rational(1, i));
			if (next.num < 0) continue;
			dfs(next, mul * i, depth + 1, i);
		}
	}

	static class Rational {
		long num, den;

		Rational(long num, long den) {
			long gcd = gcd(num, den);
			this.num = num / gcd;
			this.den = den / gcd;
		}

		Rational sub(Rational o) {
			long n = this.num * o.den - o.num * this.den;
			long d = this.den * o.den;
			return new Rational(n, d);
		}

		static long gcd(long a, long b) {
			return b == 0 ? a : gcd(b, a % b);
		}

	}

}