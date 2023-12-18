import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++)
				x[i] = scan.nextInt();
			for (int i = 0; i < n; i++)
				y[i] = scan.nextInt();

			for (int p = 1; p <= 3; p++) {
				double D = 0;
				for (int i = 0; i < n; i++)
					D += Math.pow(Math.abs(x[i] - y[i]), p);
				D = Math.pow(D, 1 / (double) p);
				System.out.println(D);
			}
			int D = 0;
			for (int i = 0; i < n; i++)
				D = Math.max(Math.abs(x[i] - y[i]), D);
			System.out.println(D);

			break;
		}

		scan.close();
		System.exit(0);
	}

}