import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int sum = 0;

		if ((y % 2) != 0) {
			System.out.println("No");
			System.exit(0);
		} else if ((y == 2 * x) || (y == 4 * x)) {
			System.out.println("Yes");
			System.exit(0);
		} else {
			for (int i = 0; i < x; i++) {
				sum = (2 * (x - i)) + (4 * i);
				if (sum == y) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");

		scan.close();

	}

}
