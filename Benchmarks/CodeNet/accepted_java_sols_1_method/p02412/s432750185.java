import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			}

			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					if (i + j >= x) {
						break;
					} else {
						for (int k = j + 1; k <= n; k++) {
							if (i + j + k == x) {
								count++;
								break;
							}
						}
					}
				}
			}

			System.out.println(count);

		}

	}
}

