import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[] s = new int[n];
			double m = 0;
			for (int i = 0; i < n; i++) {
				s[i] = scan.nextInt();
				m += s[i];
			}
			m /= n;
			double a = 0;
			for (int i = 0; i < n; i++) {
				a += Math.pow(s[i] - m, 2);
			}
			a = Math.sqrt(a / n);

			System.out.println(a);

		}

		scan.close();
		System.exit(0);
	}

}