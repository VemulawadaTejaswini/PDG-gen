

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] s = new boolean[123456 * 2];
		Arrays.fill(s, true);

		s[1] = false;

		// テ・ツ篠淌・ツ崢?」ツ?禿」ツ??
		for (int i = 2; i * i < 123456 * 2; i++) {
			for (int j = i; j < 123456 * 2; j++) {
				if (s[j]) {
					if (j == i) {
						continue;
					} else if (j % i == 0) {
						s[j] = false;
					}
				}

			}
		}

		// System.out.println(s[17]);
		// System.out.println(s[19]);
		// System.out.println(s[23]);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int cnt = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				if (s[i]) {
					cnt++;
				}
			}

			System.out.println(cnt);

		}

	}
}