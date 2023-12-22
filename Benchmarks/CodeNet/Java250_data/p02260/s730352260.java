import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		// run(a);
		runSel(a);

		scan.close();
		System.exit(0);
	}

	private static void runSel(int[] a) {
		int op = 0;
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++)
				if (a[j] < a[min])
					min = j;
			if (min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
				op++;
			}
		}

		outResult(a, op);

	}

	private static void run(int[] a) {
		int op = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = a.length - 1; j > i; j--)
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					op++;
				}

		outResult(a, op);
	}

	private static void outResult(int[] a, int op) {
		for (int i = 0; i < a.length; i++)
			if (i == 0)
				System.out.print(a[i]);
			else
				System.out.print(" " + a[i]);
		System.out.println();
		System.out.println(op);

	}

}