
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int a[] = new int[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}

			int count = 0;
			for (int i = 0; i < n; i++) {
				if (sum >= (long) a[i] * n) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}

