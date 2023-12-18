import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int r = s.nextInt();

			if (n == 0 && r == 0)
				break;

			int[] a = new int[n];
			int[] b = new int[n];

			for (int t = 0; t < n; t++) {
				a[t] = t + 1;
				b[t] = t + 1;
			}

			for (int i = 0; i < r; i++) {
				int p = s.nextInt();
				int c = s.nextInt();

				for (int x = 0; x < c; x++)
					b[n - c + x] = a[n - p + 1 - c + x];

				for (int y = 0; y < p - 1; y++)
					b[n - c - p + 1 + y] = a[n - p + 1 + y];

				for (int j = 0; j < n; j++)
					a[j] = b[j];
			}
			System.out.println(b[n - 1]);
		}
		s.close();
	}
}