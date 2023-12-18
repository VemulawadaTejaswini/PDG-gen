import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] num = new int[n];
		char[] mark = new char[n];

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			mark[i] = s.charAt(0);
			num[i] = s.charAt(1) - '0';
		}

		int[] a = new int[num.length];
		char[] m = new char[num.length];
		for (int i = 0; i < num.length; i++) {
			a[i] = num[i];
			m[i] = mark[i];
		}
		runBub(m, a);

		int[] a1 = new int[num.length];
		char[] m1 = new char[num.length];
		for (int i = 0; i < num.length; i++) {
			a1[i] = num[i];
			m1[i] = mark[i];
		}

		runSel(m1, a1);
		int ic;
		for (ic = 0; ic < mark.length; ic++)
			if (m1[ic] != m[ic])
				break;
		if (ic < mark.length)
			System.out.println("Not stable");
		else
			System.out.println("Stable");

		scan.close();
		System.exit(0);
	}

	private static void runSel(char[] m, int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++)
				if (a[j] < a[min])
					min = j;
			if (min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
				char tmpc = m[i];
				m[i] = m[min];
				m[min] = tmpc;
			}
		}

		outResult(m, a);
	}

	private static void runBub(char[] m, int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = a.length - 1; j > i; j--)
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					char tmpc = m[j];
					m[j] = m[j - 1];
					m[j - 1] = tmpc;
				}

		outResult(m, a);
		System.out.println("Stable");
	}

	private static void outResult(char[] m, int[] a) {
		for (int i = 0; i < m.length; i++)
			if (i == 0)
				System.out.print("" + m[i] + a[i]);
			else
				System.out.print(" " + m[i] + a[i]);
		System.out.println();

	}

}