package progA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = i;
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else {
				do {
					if (a % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					a /= 10;
				} while (a != 0);
			}
		}
		System.out.println("");
	}
}