

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int count = 1;

		for (count = 1; count <= num; count++) {

			// 3??§?????????????????°?????¨???
			if (count % 3 == 0) {

				System.out.print(" " + count);

				// ???????????????3?????°?????¨???
			} else if (count % 10 == 3) {

				System.out.print(" " + count);

			} else {

				int x = count;

				while (x > 10) {

					x /= 10;

					if (x % 10 == 3) {

						System.out.print(" " + count);
						break;

					}
				}
			}
		}
		System.out.println("");
	}
}