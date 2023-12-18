import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		for (int i = 3; i <= x; i++) {

			int y = 0;
			y = i;

			if (i % 10 == 3 || i % 3 == 0)
				System.out.print(i + " ");
			else {
				while (y > 0) {
					y /= 10;

					if (y % 10 == 3)
						System.out.print(i + " ");

				}
			}
		}
	}
}