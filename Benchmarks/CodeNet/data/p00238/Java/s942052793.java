
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int sum = 0;
			while (m-- > 0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				sum += b - a;
			}
			if (sum > n)
				System.out.println("OK");
			else
				System.out.println(n - sum);
		}
	}
}