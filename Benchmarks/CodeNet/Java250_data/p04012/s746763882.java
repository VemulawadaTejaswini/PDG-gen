import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String w = sc.next().toLowerCase();
			String[] y = new String[w.length()];

			if (w.length() % 2 == 0) {
				for (int i = 0; i < w.length(); i++) {
					y[i] = String.valueOf(w.charAt(i));
				}
				Arrays.sort(y);

				int ans = 0;

				for (int i = 0; i < w.length() / 2; i++) {

					if (y[2 * i].equals(y[2 * i + 1])) {
						ans += 0;
					} else {
						ans += 1;
					}
				}

				if (ans == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			} else {

				System.out.println("No");

			}
		}
	}
}