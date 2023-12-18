import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_5_D-in19.txt"));
		// while (scan.hasNext()) {

		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		msort(a, 0, n);

		System.out.println(cnt2);

		scan.close();
		System.exit(0);
	}

	static int cnt;
	static long cnt2;

	private static void msort(int[] a, int st, int max) {
		if (max - st < 2)
			return;
		int mid = (max + st) / 2;
		msort(a, st, mid);
		msort(a, mid, max);
		marge(a, st, mid, max);
	}

	private static void marge(int[] a, int st, int mid, int max) {
		int[] m1 = new int[mid - st + 1];
		int[] m2 = new int[max - mid + 1];

		for (int p = st, i = 0; p < mid; p++, i++)
			m1[i] = a[p];
		m1[m1.length - 1] = Integer.MAX_VALUE;

		for (int p = mid, i = 0; p < max; p++, i++)
			m2[i] = a[p];
		m2[m2.length - 1] = Integer.MAX_VALUE;

		int p1 = 0, p2 = 0;
		for (int i = st; i < max; i++)
			if (m1[p1] > m2[p2]) {
				a[i] = m2[p2++];
				cnt2 += (mid - st - p1);
			} else
				a[i] = m1[p1++];
		cnt += (max - st);
	}

}