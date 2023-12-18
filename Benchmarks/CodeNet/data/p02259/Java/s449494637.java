import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		run(a);

		scan.close();
		System.exit(0);
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
		for (int i = 0; i < a.length; i++)
			if (i == 0)
				System.out.print(a[i]);
			else
				System.out.print(" " + a[i]);
		System.out.println();
		System.out.println(op);

	}

}