

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, t, min = 100000, c, l;

		n = sc.nextInt();
		t = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			c = sc.nextInt();
			l = sc.nextInt();
			if (l <= t) {
				min = Math.min(min, c);
			}
		}

		if (min > 1000) {
			System.out.println("TLE");
		} else {
			System.out.println(min);
		}
		sc.close();
	}

}
