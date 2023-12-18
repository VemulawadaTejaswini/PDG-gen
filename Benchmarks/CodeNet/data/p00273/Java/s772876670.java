
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int b = scanner.nextInt();
			int p = scanner.nextInt();
			int an1 = x * b + y * p;
			int an2 = (int) ((x * Math.max(5, b) + y * Math.max(2, p)) * 0.8);
			System.out.println(Math.min(an1, an2));
		}
	}
}