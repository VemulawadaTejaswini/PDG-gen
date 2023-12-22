import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		// 1 * i で表すことができる
		if (n < 10) {
			System.out.println("Yes");
			return;
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i * j == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");

	}
}
