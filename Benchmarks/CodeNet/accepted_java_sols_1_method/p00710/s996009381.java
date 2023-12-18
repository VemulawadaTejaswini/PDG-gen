import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0) {
				break;
			}

			int[] w;
			w = new int[n];
			for (int i = 0; i < n; i++) {
				w[i] = n - i;
			}

			for (int i = 0; i < r; i++) {
				int[] a, b;
				int p = sc.nextInt();
				int c = sc.nextInt();
				a = new int[p - 1];
				b = new int[c];
				for (int j = 0; j < p - 1; j++) {
					a[j] = w[j];
				}
				for (int j = 0; j < c; j++) {
					b[j] = w[p - 1 + j];
				}
				for (int j = 0; j < c; j++) {
					w[j] = b[j];
				}
				for (int j = 0; j < p - 1; j++) {
					w[j + c] = a[j];
				}
			}

			System.out.println(w[0]);

		}

	}
}
