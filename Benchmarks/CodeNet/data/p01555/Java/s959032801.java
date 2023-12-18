import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long l = 0;
		long r = Long.MAX_VALUE / 4;
		while (r - l > 1) {
			long mid = (l + r) / 2;
			if (calc(mid) >= s)
				r = mid;
			else
				l = mid;
		}

		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < 25; i++) {
			long ns = l + i + 1;
			if (ns % 15 == 0) {
				sb.append("FizzBuzz");
			} else if (ns % 3 == 0) {
				sb.append("Fizz");
			} else if (ns % 5 == 0) {
				sb.append("Buzz");
			} else {
				sb.append(ns);
			}
		}
		System.out.println(sb.toString().substring((int) (s - calc(l) - 1), 20 + (int) (s - calc(l) - 1)));
	}

	static long calc(long a) {
		long ret = a / 3 * 4 + a / 5 * 4;
		long l = 0;
		for (long p = 1; a >= p; p *= 10) {
			l++;
			long R = Math.min(a, p * 10 - 1);
			long L = p - 1;
			ret += ((R - R / 3 - R / 5 + R / 15) - (L - L / 3 - L / 5 + L / 15)) * l;
		}
		return ret;
	}
}