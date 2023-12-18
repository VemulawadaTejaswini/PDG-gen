import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		int count = 0;

		for (int i = 0; i < m; i++) {
			int c = 0;
			a[n] = b[i];
			while (a[c] != a[n]) {
				c++;
			}
			if (c != n) {
				count++;
			}
		}
		System.out.println(count);

	}
}
