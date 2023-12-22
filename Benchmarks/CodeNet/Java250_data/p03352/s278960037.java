

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		int max = 1;
		for (int b = 1; b < i + 1; b++) {
			for (int p = 2; p <11 ; p++) {
				if ((Math.pow(b, p) <= i)) {
					if (max < Math.pow(b, p)) {
						max = (int) Math.pow(b, p);
					}
				}
			}
		}
		System.out.println(max);
	}
}
