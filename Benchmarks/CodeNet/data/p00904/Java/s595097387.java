import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int all = scan.nextInt();
		for (int i = 0; i < all; i++) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int sum = m * m + n * n;

			refact: for (int x = 2; x * x <= sum; x++) {
				// m^2*n^2の約数を探す
				if (sum % x == 0) {
					int y = sum / x;
					for (int j = 0; j * j <= x; j++) {
						double diff = Math.sqrt(x - j * j);
						int tmp = (int) diff;
						if (diff == tmp) {
							System.out.println("C");
							break refact;
						}
					}
					for (int j = 0; j * j <= y; j++) {
						double diff = Math.sqrt(y - j * j);
						int tmp = (int) diff;
						if (diff == tmp) {
							System.out.println("C");
							break refact;
						}
					}
				}
				if ((x + 1) * (x + 1) > sum) {
					System.out.println("P");
				}
			}

		}
		scan.close();

	}
}