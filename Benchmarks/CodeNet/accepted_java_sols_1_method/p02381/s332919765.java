
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int n = scn.nextInt();
			if (n == 0) {
				break;
			}
			double m = 0;
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = scn.nextInt();
				m = m + s[i];
			}
			m = m / n;
			double σ = 0;
			for (int i = 0; i < n; i++) {
				σ = σ + (s[i] - m) * (s[i] - m);
			}
			System.out.println(Math.sqrt(σ / n));
		}
	}
}
