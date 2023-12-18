package progA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}

			if ((a < 1) || (b > 300)) {
				System.out.println("");
				continue;
			}
			for (int i = 1; i <= a; i++) {
				if ((i % 2) == 1) {
					for (int j = 1; j <= b; j++) {
						if ((j % 2) == 1)
							System.out.printf("#");
						else
							System.out.printf(".");
					}
				} else {
					for (int j = 1; j <= b; j++) {
						if ((j % 2) == 1)
							System.out.printf(".");
						else
							System.out.printf("#");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}
}