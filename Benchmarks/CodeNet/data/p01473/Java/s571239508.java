import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static long solve() {
		char[] s = sc.next().toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < s.length; ++i) {
			++count[s[i] - 'a'];
		}
		int odd = 0;
		for (int i = 0; i < count.length; ++i) {
			if (count[i] % 2 != 0) ++odd;
		}
		if (s.length % 2 == 0) {
			if (odd != 0) return 0;

		} else {
			if (odd != 1) return 0;
		}
		for (int i = 0; i < count.length; ++i) {
			count[i] /= 2;
		}
		BigInteger[] fact = new BigInteger[s.length / 2 + 1];
		fact[0] = BigInteger.ONE;
		for (int i = 1; i < fact.length; ++i) {
			fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
		}
		BigInteger ans = fact[s.length / 2];
		for (int i = 0; i < count.length; ++i) {
			ans = ans.divide(fact[count[i]]);
		}
		return ans.longValue();
	}

	public static void main(String[] args) {
		System.out.println(solve());
	}
}