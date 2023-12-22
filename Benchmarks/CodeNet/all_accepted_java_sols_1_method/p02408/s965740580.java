

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;

		boolean cards[][] = new boolean[4][13];
		for (int i = 0; i < num; i++) {
			String mark = scanner.next();
			int n = scanner.nextInt();
			int m = 0;
			if (mark.equals("S")) {
				m = 0;
			} else if (mark.equals("H")) {
				m = 1;
			} else if (mark.equals("C")) {
				m = 2;
			} else if (mark.equals("D")) {
				m = 3;
			}
			cards[m][n - 1] = true;
		}
		while (count < 52 - num) {
			for (int m2 = 0; m2 <= 3; m2++) {
				for (int n2 = 0; n2 <= 12; n2++) {
					if (cards[m2][n2] == false) {
						if (m2 == 0) {
							System.out.println("S" + " " + (n2 + 1));
							count = count + 1;
						} else if (m2 == 1) {
							System.out.println("H" + " " + (n2 + 1));
							count = count + 1;
						} else if (m2 == 2) {
							System.out.println("C" + " " + (n2 + 1));
							count = count + 1;
						} else if (m2 == 3) {
							System.out.println("D" + " " + (n2 + 1));
							count = count + 1;
						}
					}
				}
			}
		}
		scanner.close();
	}

}

