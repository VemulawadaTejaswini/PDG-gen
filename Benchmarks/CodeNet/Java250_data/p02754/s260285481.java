/*
javac Main.java && java Main
*/

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);

	long n, a, b;

	Main() {
		n = in.nextLong();
		a = in.nextLong();
		b = in.nextLong();

		long s = a + b;
		long q = n / s;
		long r = n % s;

		long x = a * q + min(a, r);
		out.println(x);
		out.close();
	}

	
	
	int abs(int x) { if (x < 0) return -x; return x; }
	long abs(long x) { if (x < 0) return -x; return x; }
	int max(int x, int y) { if (x < y) return y; return x; }
	int min(int x, int y) { if (x > y) return y; return x; }
	long max(long x, long y) { if (x < y) return y; return x; }
	long min(long x, long y) { if (x > y) return y; return x; }
	int gcd(int x, int y) { while (y > 0) { x = y^(x^(y = x)); y %= x; } return x; }
	long gcd(long x, long y) { while (y > 0) { x = y^(x^(y = x)); y %= x; } return x; }
	long lcm(int x, int y) { return ((long) x) * (y / gcd(x, y)); }
	long lcm(long x, long y) { return x * (y / gcd(x, y)); }

	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
