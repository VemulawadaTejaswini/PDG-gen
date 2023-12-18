import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n >= 10) {
				if ((i % 10 == 3) || (i % 3 == 0)) {
					System.out.print(" " + i);
					continue;
				}
				
				int x = i;

				while (x > 9) {
					/*if ((i % 10 == 3) || (i % 3 == 0)) {
						System.out.print(" " + i);
						break;
					}*/

					x = x / 10;
					if ((x % 10 == 3) ) {
						System.out.print(" " + i);
						break;
					}
					
				}

			} else {
				if ((i % 10 == 3) || (i % 3 == 0)) {
					System.out.print(" " + i);

				}
			}

		}
		System.out.println();
	}

}