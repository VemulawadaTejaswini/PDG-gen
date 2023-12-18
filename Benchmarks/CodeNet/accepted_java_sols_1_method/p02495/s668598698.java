import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		while (j == 0) {
			int w = sc.nextInt();

			int h = sc.nextInt();
			if (w == 0 && h == 0) {
				j = 1;
			}
			if (1 <= w && w <= 300 && 1 <= h && h <= 300) {
				for (int i = 1; i <= w; i++) {
					for (int k = 1; k <= h; k++) {
						if (i % 2 == 1) {
						if (k % 2 == 1) {
							System.out.print("#");
							} else {
						System.out.print(".");
							}
						} else {
					if (k % 2 == 1) {
						System.out.print(".");
					} else {
						System.out.print("#");
							}
						}
					}
					System.out.print("\n");

				}
				System.out.print("\n");

			}
		}
		sc.close();
	}
}