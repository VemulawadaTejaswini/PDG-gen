import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		if (d < 10) {
			System.out.println(0);
			return;
		}

		int count = 0;
		for (int j = 1; j <= m; j++) {
			for (int i = 10; i <= d; i++) {
				int d1 = i / 10;
				int d2 = i % 10;

				if (d1 == 1 || d2 == 1) {
					continue;
				}
				else if (j == d1 * d2) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
