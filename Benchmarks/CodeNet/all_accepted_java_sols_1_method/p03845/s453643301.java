import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] t = new int[n];
		int[] t2 = new int[n];

		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			t[i] = scan.nextInt();
		}

		//System.out.println(t[0]);
		//System.out.println(t[1]);
		//System.out.println(t[2]);

		int m = scan.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];

		j = 0;
		for (j = 0; j < m; j++) {
			p[j] = scan.nextInt();
			x[j] = scan.nextInt();
		}
		/*
				System.out.println(p[0]);
				System.out.println(p[1]);
				System.out.println(x[0]);
				System.out.println(x[1]);
		*/

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				t2[j] = t[j];
			}

			t2[p[i] - 1] = x[i];
			int sum = 0;
			for (j = 0; j < n; j++) {
				sum = sum + t2[j];
			}
			System.out.println(sum);
		}

	}

}