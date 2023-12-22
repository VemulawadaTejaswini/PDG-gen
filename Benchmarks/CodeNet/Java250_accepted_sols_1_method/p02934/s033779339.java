import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sc.close();
		double m = 0;
		double l;

		for (int i = 0; i < n; i++)
			m = m + (double) 1 / a[i];

		l = 1 / m;

		System.out.println(l);

	}
}