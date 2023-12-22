

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		if (Math.abs(a - b) > k || Math.abs(a - c) > k || Math.abs(a - d) > k || Math.abs(a - e) > k
				|| Math.abs(b - c) > k || Math.abs(b - d) > k || Math.abs(b - e) > k || Math.abs(c - d) > k
				|| Math.abs(c - e) > k || Math.abs(d - e) > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

	}

}
