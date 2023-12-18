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
		long divide = 1;
		int odd = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] % 2 != 0) {
				odd++;
				if (odd > 1 || s.length() % 2 == 0) {
					System.out.println(0);
					return;
				}
			}
			if (alpha[i] != 0) {
				for (long j = 1; j <= alpha[i] / 2; j++) {
					divide *= j;
				}
			}
		}

		long ans = 1;
		for (long i = 2; i <= s.length() / 2; i++) {
			ans *= i;
		}
		ans /= divide;
		System.out.println(ans);
		sc.close();
	}
}