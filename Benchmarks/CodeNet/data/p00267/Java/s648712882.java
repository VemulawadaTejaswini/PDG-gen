
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = scanner.nextInt();
			for (int i = 0; i < n; i++)
				b[i] = scanner.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i < n / 2; i++) {
				if (a[n - 1 - i * 2] > b[n - 1 - i]) {
					System.out.println((i * 2) + 1);
					continue loop;
				}
			}
			System.out.println("NA");
		}
	}
}