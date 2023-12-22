

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int anser;

		if (n == 0) {
			anser = m * (m - 1) / 2;
		} else if (m == 0) {
			anser = n * (n - 1) / 2;
		} else {
			anser = (n * (n - 1) + m * (m - 1)) / 2;
		}

		System.out.println(anser);
	}

}
