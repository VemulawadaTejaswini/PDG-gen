import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		Qsort(a, 0, n - 1);

		StringBuilder s = new StringBuilder(String.valueOf(a[0]));
		for (int i = 1; i < a.length; i++)
			s.append(" " + a[i]);
		System.out.println(s);

		scan.close();
		System.exit(0);
	}

	private static void Qsort(int[] a, int st, int ed) {
		if (st >= ed)
			return;
		int x = a[ed];
		int l = st, r = ed - 1;
		while (true) {
			for (; l < ed && a[l] <= x; l++)
				;
			for (; r >= st && a[r] > x; r--)
				;
			if (l < r) {
				int tmp = a[l];
				a[l] = a[r];
				a[r] = tmp;
			} else
				break;
		}
		int tmp = a[l];
		a[l] = a[ed];
		a[ed] = tmp;
		Qsort(a, st, l - 1);
		Qsort(a, l + 1, ed);
	}

	private static void Csort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		for (int i = 0; i < a.length; i++)
			c[a[i]]++;
		for (int i = 1; i < c.length; i++)
			c[i] += c[i - 1];

		for (int i = a.length - 1; i >= 0; i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}
	}
}