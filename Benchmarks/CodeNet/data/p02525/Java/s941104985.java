import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int sum = 0;
			int[] s = new int[n];
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.nextInt();
				sum = sum + s[i];
			}
			double m = 0.0;
			double aa = 0.0;
			m = sum / n;
			double x = 0.0;
			for (int i = 0; i < n; i++) {
				x = x + (s[i] - m) * (s[i] - m);
			}
			aa = x / n;
			double a = Math.sqrt(aa);
			System.out.println(a);
		}
	}
}