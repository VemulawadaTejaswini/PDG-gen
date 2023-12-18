import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] f;
	static int pos;
	static int T;

	public static void main(String[] args) {
		int N = sc.nextInt();
		T = sc.nextInt();
		f = sc.next().toCharArray();
		ArrayList<Term> poly = new ArrayList<Term>();
		while (pos < f.length) {
			poly.add(parse());
			++pos;
		}
		long ans = 0;
		for (Term t : poly) {
			ans += t.eval(N);
		}
		if (ans > 1000000000) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}
	}

	static Term parse() {
		pos += 2;
		int p = f[pos++] - '0';
		return new Term(p);
	}

	static class Term {
		int p;

		Term(int p) {
			this.p = p;
		}

		long eval(int n) {
			long ret = T;
			for (int i = 0; i < p; ++i) {
				ret *= n;
				if (ret > 1000000000) return ret;
			}
			return ret;
		}
	}

}