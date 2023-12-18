import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int n, m;
		int x, y;
		int p, q, r;
		int count;

		n = sc.nextInt();
		while (n != 0) {
			a = new int [n];
			for (int i = 0; i < n; i++) {
				a[i] = i + 1;
			}
			m = sc.nextInt();
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			for (int i = 0; i < m; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				f(a, n, x, y);
			}
			count = 0;
			for (int i = p - 1; i < q; i++) {
				if (a[i] <= r) {
					count++;
				}
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}

	public static void f(int a[], int n, int x, int y) {
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < n; i++) {
			if (i < x) {
				a[i - x + n] = b[i];
			} else if (x <= i && i < y) {
				a[i - x - y + n] = b[i];
			} else {
				a[i - y] = b[i];
			}
		}
	}
}