import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int[] s;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			s = new int[n];
			int sum = 0;
			double m = 0, a = 0, a2 = 0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			m = (double) sum / n;
			for (int i = 0; i < n; i++) {
				a2 += Math.pow((s[i] - m), 2);
			}
			a = Math.sqrt(a2 / n);
			System.out.printf("%.8f\n", a);
		}

	}
}
