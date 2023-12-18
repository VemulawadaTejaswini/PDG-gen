import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j, k, n = 1, x = 1;

		while (n != 0 || x != 0) {
			int count = 0;
			n = scanner.nextInt();
			x = scanner.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			for (i = 1; i <= n; i++) {
				for (j = 1; j < n; j++) {
					for (k = 1; k < n; k++) {
						if (i > k && j > k && i > j) {
							if (i != j && i != k && j != k) {
								if (i + k + j == x) {
									count = count + 1;
								}
							}
						}
					}
				}
			}
			System.out.println(count);

		}

	}
}

