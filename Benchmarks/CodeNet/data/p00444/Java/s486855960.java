
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			n = 1000 - n;
			int ans = 0;
			for (int c : coin) {
				if (n >= c) {
					int a = n / c;
					n -= a * c;
					ans += a;
				}
			}
			System.out.println(ans);
		}
	}
}