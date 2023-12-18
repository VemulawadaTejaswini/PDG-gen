import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		System.out.println(run(a));
		scan.close();
		System.exit(0);
	}

	private static long run(int[] a) {
		if (a.length == 0)
			return (long) 1;
		if (a.length == 1)
			return (long) a[0];

		long result = 1;
		for (int i = 2; i <= a[0];)
			if (a[0] % i == 0) {
				result *= i;
				a[0] /= i;
				for (int k = 1; k < a.length; k++)
					if (a[k] % i == 0)
						a[k] /= i;
			} else
				i++;
		int[] b = new int[a.length - 1];
		for (int i = 1, j = 0; i < a.length; i++, j++)
			b[j] = a[i];
		return result * run(b);
	}

}