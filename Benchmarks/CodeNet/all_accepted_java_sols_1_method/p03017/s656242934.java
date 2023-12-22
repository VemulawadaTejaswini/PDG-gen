
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			String s = sc.next();
			char[] chs = s.toCharArray();

			char ROCK = '#';

			if (a == c && b == d) {
				System.out.println("Yes");
				return;
			}

			boolean isBeforeDoubleRock = false;
			for (int i = a + 1; i < c; i++) {
				if (chs[i] == ROCK) {
					if (isBeforeDoubleRock) {
						System.out.println("No");
						return;
					}
					isBeforeDoubleRock = true;
				} else {
					isBeforeDoubleRock = false;
				}
			}
			isBeforeDoubleRock = false;
			for (int i = b + 1; i < d; i++) {
				if (chs[i] == ROCK) {
					if (isBeforeDoubleRock) {
						System.out.println("No");
						return;
					}
					isBeforeDoubleRock = true;
				} else {
					isBeforeDoubleRock = false;
				}
			}

			// D < C
			if (d < c) {
				int spaceCount = 0;
				for (int i = b - 1; i <= d + 1; i++) {
					if (chs[i] != ROCK) {
						spaceCount++;
					} else {
						spaceCount = 0;
					}
					if (3 <= spaceCount) {
						System.out.println("Yes");
						return;
					}
				}
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		}
	}
}
