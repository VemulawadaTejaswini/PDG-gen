
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	char[] c = { 'A', 'B', 'C', 'D', 'E' };

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int index = 0;
			int max = n + m;
			for (int i = 1; i < 5; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = a + b;
				if (max < c) {
					max = c;
					index = i;
				}
			}
			System.out.println(c[index] + " " + max);

		}
	}
}