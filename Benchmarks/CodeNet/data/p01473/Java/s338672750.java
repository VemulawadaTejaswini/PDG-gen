import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() == 1) {
			System.out.println(1);
			return;
		}
		long[] alpha = new long[26];
		for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 97]++;
		}
		BigInteger divide = new BigInteger("1");
		int a = 0, b = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] % 2 != 0) {
				if (alpha[i] / 2 == 0) {
					a++;
				} else {
					b++;
				}
				if (a > 1) {
					System.out.println(0);
					return;
				}
			} else if (alpha[i] != 0) {
				for (long j = 2; j <= alpha[i] / 2; j++) {
					divide = divide.multiply(BigInteger.valueOf(j));
				}
			}
		}

		BigInteger ans = new BigInteger("1");
		for (long i = 2; i <= s.length() / 2; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		ans = ans.divide(divide);
		if (b == 1) {
			ans = ans.divide(BigInteger.valueOf(2));
		}
		System.out.println(ans);
		sc.close();
	}
}