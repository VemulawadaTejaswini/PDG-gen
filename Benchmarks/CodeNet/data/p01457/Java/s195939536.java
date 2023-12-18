import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static boolean isLang(String s) {
		int n = s.length();
		if (n == 2) {
			if (s.charAt(0) == '(' && s.charAt(n-1) == ')') return true;
			if (s.charAt(0) == ')' && s.charAt(n-1) == '(') return true;
		}
		if (n == 1) return false;
		if (n == 0) return true;
		if ((s.charAt(0) == '(' && s.charAt(n-1) == ')') || (s.charAt(0) == ')' && s.charAt(n-1) == '(')) {
			if (isLang(s.substring(1, n-1))) return true;
		}
		for (int i=1; i<n-1; i++) {
			if (isLang(s.substring(0, i)) && isLang(s.substring(i, n)))
				return true;
		}
		return false;
	}

	static void solve() {
		int q = in.nextInt();
		StringBuilder s = new StringBuilder();
		while (q-- > 0) {
			int pos = in.nextInt();
			char c = in.next().charAt(0);
			int t = in.nextInt();
			while (t-- > 0) {
				s.insert(pos, c);
			}
			out.println(isLang(s.toString()) ? "Yes" : "No");
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}