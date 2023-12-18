import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * FizzBuzz
 */
public class Main {

	static final long MAX = 100000000000000000L;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		long s = parseLong(br.readLine());

		long left, right, mid, len;
		left = 1;
		right = MAX + 1;
		mid = 0;
		len = 0;

		while (left < right) {
			mid = left + (right - left) / 2;
			len = len(mid);
			if (len - fizzbuzz(mid).length() < s && s <= len) {
				break;
			} else if (len - fizzbuzz(mid).length() <= s) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		StringBuilder ans = new StringBuilder();

		long _mid = mid;
		long _s = len + 1;

		outer:
		while (true) {
			String tmp = fizzbuzz(_mid);
			for (int i = tmp.length() - 1; i >= 0; i--) {
				ans.append(tmp.charAt(i));
				_s--;
				if (_s == s) break outer;
			}
			_mid--;
		}
		ans = ans.reverse();

		for (long i = mid + 1; ans.length() < 20; i++) {
			ans.append(fizzbuzz(i));
		}

		System.out.println(ans.toString().substring(0, 20));
	}

	static long len(long m) {

		if (m == 0) return 0;

		int n = String.valueOf(m).length();
		long _m = ((long) Math.pow(10, n - 1)) - 1;

		long q3 = m / 3 - _m / 3;
		long q5 = m / 5 - _m / 5;
		long q15 = m / 15 - _m / 15;
		long q35 = q3 + q5 - q15 * 2;

		return (m - _m - q35 - q15) * n + q35 * 4 + q15 * 8 + len(_m);
	}

	static String fizzbuzz(long m) {
		if (m == 0) {
			return "";
		} else if (m % 15 == 0) {
			return "FizzBuzz";
		} else if (m % 3 == 0) {
			return "Fizz";
		} else if (m % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(m);
		}
	}
}