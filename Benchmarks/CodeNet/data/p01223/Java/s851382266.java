
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int m = scanner.nextInt();
			int[] num = new int[m];
			for (int i = 0; i < m; i++)
				num[i] = scanner.nextInt();
			int a = 0;
			int b = 0;
			for (int i = 1; i < m; i++) {
				a = Math.max(a, num[i] - num[i - 1]);
				b = Math.max(b, num[i - 1] - num[i]);
			}
			System.out.println(a + " " + b);

		}
	}
}