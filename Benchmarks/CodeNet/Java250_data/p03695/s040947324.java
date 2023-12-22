

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int a = 0;
		boolean[] b = new boolean[8];
		int count = 0;

		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(sc.next());

			if (a >= 3200) {
				count++;
			} else if (a >= 2800) {
				b[7] = true;
			} else if (a >= 2400) {
				b[6] = true;
			} else if (a >= 2000) {
				b[5] = true;
			} else if (a >= 1600) {
				b[4] = true;
			} else if (a >= 1200) {
				b[3] = true;
			} else if (a >= 800) {
				b[2] = true;
			} else if (a >= 400) {
				b[1] = true;
			} else {
				b[0] = true;
			}
		}

		int min = 0;
		for (boolean f : b) {
			if (f)
				min++;
		}

		if (min == 0) {
			min = 1;
			count--;
		}

		System.out.println(min + " " + (min + count));

	}

}
