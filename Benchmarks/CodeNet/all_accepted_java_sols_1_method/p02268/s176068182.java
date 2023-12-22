import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int m = Integer.parseInt(sc.next());
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			int top = 0;
			int end = n;
			int pos = 0;
			while (top < end) {
				pos = (top + end) / 2;
				if (b[i] == a[pos]) {
					count++;
					break;
				} else if (b[i] > a[pos]) {
					top = pos;

				} else {
					end = pos;
				}
				if (pos == (top + end) / 2) {
					break;
				}
			}

		}

		System.out.println(count);

	}
}
