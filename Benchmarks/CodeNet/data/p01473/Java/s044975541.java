import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long[] alpha = new long[26];
		for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 97]++;
		}
		BigInteger divide = new BigInteger("1");
		for (int i = 0; i < 26; i++) {
			if (alpha[i] % 2 != 0) {
				System.out.println(0);
				return;
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
		System.out.println(ans);
		sc.close();
	}
}