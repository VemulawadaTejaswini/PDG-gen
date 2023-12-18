
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
			for (int i = 0; i < n; i++) {
				int[] a = new int[4];
				int[] b = new int[4];
				for (int j = 0; j < 4; j++) {
					a[j] = scanner.nextInt();
				}
				for (int j = 0; j < 4; j++) {
					b[j] = scanner.nextInt();
				}
				int aa = a[0] * b[0] - a[1] * b[1] - a[2] * b[2] - a[3] * b[3];
				int bb = a[0] * b[1] + a[1] * b[0] + a[2] * b[3] - a[3] * b[2];
				int cc = a[0] * b[2] - a[1] * b[3] + a[2] * b[0] + a[3] * b[1];
				int dd = a[0] * b[3] + a[1] * b[2] - a[2] * b[1] + a[3] * b[0];
				System.out.printf("%d %d %d %d\n", aa, bb, cc, dd);
			}

		}
	}
}