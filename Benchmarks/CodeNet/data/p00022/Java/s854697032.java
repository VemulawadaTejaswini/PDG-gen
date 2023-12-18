import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0)
				return;
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int M = -Integer.MAX_VALUE / 2;
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum += a[j];
					M = Math.max(M, sum);
				}
			}
			System.out.println(M);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}