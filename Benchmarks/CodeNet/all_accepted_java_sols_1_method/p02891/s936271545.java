import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		sc.close();

		if (s.length() == 1) {
			System.out.println(k / 2);
			return;
		}

		long change = 0;
		char first = s.charAt(0);
		char before = s.charAt(0);
		boolean isDuplicate = false;
		boolean isAllSame = true;
		int i = 1;
		while (i < s.length()) {
			char now = s.charAt(i);
			if (isAllSame && before != now) {
				isAllSame = false;
			}
			if (before == now) {
				change++;
				if (i + 1 < s.length() && s.charAt(i + 1) == now) {
					i++;
				}
			}
			before = now;
			i++;
		}
		if (isAllSame) {
			long len = s.length();
			System.out.println((len * k) / 2);
			return;
		}

		boolean isSame = true;
		int sameLen = 0;
		int j = 0;
		char now = s.charAt(0);
		while (isSame && j < s.length()) {
			char next = s.charAt(j);
			if (now == next) {
				sameLen++;
			} else {
				isSame = false;
			}
			now = next;
			j++;
		}

		isSame = true;
		int sameLen2 = 0;
		j = 0;
		now = s.charAt(s.length() - 1);
		while (isSame && j < s.length()) {
			char next = s.charAt(s.length() - j - 1);
			if (now == next) {
				sameLen2++;
			} else {
				isSame = false;
			}
			now = next;
			j++;
		}
		if (first == s.charAt(s.length() - 1) && sameLen / 2 + sameLen2 / 2 != (sameLen + sameLen2) / 2) {
			isDuplicate = true;
		}

		long returnLong = change * k;
		if (isDuplicate) {
			returnLong = returnLong + k - 1;
		}
		System.out.println(returnLong);
	}
}