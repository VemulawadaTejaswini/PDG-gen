import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}
		long[] b = new long[m];
		for (int i = 0; i < m; i++) {
			b[i] = Long.parseLong(sc.next());
		}

		int i = 0;
		int j = 0;
		long[] books = new long[n + m];
		for (int p = 0; p < n + m; p++) {
			if (i < n && j < m) {
				if (p != 0) {
					books[p] = books[p - 1] + Math.min(a[i], b[j]);
					if (a[i] <= b[j]) {
						i++;
					} else if (a[i] > b[j]) {
						j++;
					}
				} else {
					books[p] = Math.min(a[i], b[j]);
					if (a[i] <= b[j]) {
						i++;
					} else if (a[i] > b[j]) {
						j++;
					}
				}
			} else if (i < n && j >= m) {
				books[p] = books[p - 1] + a[i];
				i++;
			} else if (i >= n && j < m) {
				books[p] = books[p - 1] + b[j];
				j++;
			} else {
				break;
			}
		}

		int ans = 0;
		for (int p = 0; p < books.length; p++) {
			if (books[p] <= k) {
				ans++;
			} else {
				break;
			}
		}

		System.out.println(ans);
		sc.close();

	}

}