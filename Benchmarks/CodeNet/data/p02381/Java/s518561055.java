import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0) break;
			int[] s = new int[n];
			double m = 0;
			for (int i = 0; i < n; ++i) {
				m += s[i] = sc.nextInt();
			}
			m /= n;
			double a = 0;
			for (int i = 0; i < n; ++i) {
				a += Math.pow(s[i] - m, 2);
			}
			System.out.println(Math.sqrt(a / n));
		}
	}
}