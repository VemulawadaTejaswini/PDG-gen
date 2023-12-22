import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long c = Long.parseLong(str[2]);
		long d = Long.parseLong(str[3]);

		System.out.println(num(b, c, d) - num(a - 1, c, d));
	}

	static long num(long n, long c, long d) {
		long G = gcd(c, d);
		long L = c / G * d;
		return n - n / c - n / d + n / L;
	}

	static long gcd(long a, long b) {
		return b > 0 ? gcd(b, a % b) : a;
	}

	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
