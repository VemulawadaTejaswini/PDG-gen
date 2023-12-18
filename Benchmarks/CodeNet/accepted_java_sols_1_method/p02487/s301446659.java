import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, x, y;
		Scanner sc = new Scanner(System.in);
		do {

			i = sc.nextInt();
			j = sc.nextInt();
			if (i == 0 && j == 0)
				break;
			for (x = 1; x <= i; x++) {
				if (x == 1 || x == i) {
					for (y = 1; y <= j; y++) {
						System.out.printf("#");
					}
				} else {
					System.out.printf("#");
					for (y = 1; y <= (j - 2); y++)
						System.out.printf(".");
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		} while (i != 0 && j != 0);
	}
}