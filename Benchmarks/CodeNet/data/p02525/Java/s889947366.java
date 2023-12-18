import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int sum = 0;
			double a = 0;

			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum = sum + s[i];
			}

			double m = sum / n;

			for (int i = 0; i < n; i++) {
				a = a + (s[i] - m) * (s[i] - m);
			}

			double alpha = Math.sqrt(a / n);

			System.out.printf("%f\n",alpha);
		}
		sc.close();
	}
}