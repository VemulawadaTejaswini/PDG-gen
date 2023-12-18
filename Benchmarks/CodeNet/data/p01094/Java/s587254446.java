
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		S: while (true) {
			int k = 0, max = 1;
			int n = s.nextInt();
			if (n == 0)
				break;
			String[] AC = new String[n];
			int[] ANS = new int[n];

			String[] c = new String[n];
			for (int i = 0; i < n; i++) {
				c[i] = s.next();
			}
			Arrays.fill(AC, " ");

			if (n == 1) {
				System.out.println(c[0] + " 1");
				continue S;
			}
			for (int i = 0; i < n; i++) {
				for (k = 0;; k++) {
					if (AC[k].equals(c[i])) {
						ANS[k]++;
						if ((k + 1) > max) {
							max = k + 1;
						}
						break;
					} else if (AC[k].equals(" ")) {
						AC[k] = c[i];
						ANS[k]++;
						if ((k + 1) > max) {
							max = k + 1;
						}
						break;
					}
				}
				int[] ANS2 = ANS.clone();
				Arrays.sort(ANS2);

				if (max >= 2) {
					if (ANS2[n - 1] > ANS2[n - 2] + (n - i - 1)) {
						for (int j = 0; j < max; j++) {
							if (ANS[j] == ANS2[n - 1]) {
								System.out.println(AC[j] + " " + (i + 1));
								continue S;
							}
						}

					}
				}
				if (ANS[k] > n / 2) {
					System.out.println(AC[k] + " " + (i + 1));
					continue S;
				}

			}
			System.out.println("TIE");
		}
		s.close();
	}
}

