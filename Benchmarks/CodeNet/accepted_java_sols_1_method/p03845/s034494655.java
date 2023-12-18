import java.util.Scanner;

public class Main {
	/**
	 * Contest with Drinks Easy
	 * @param 1 ≦ N ≦ 100
	 * @param 1 ≦ Ti ≦ 10^5
	 * @param 1 ≦ M ≦ 100
	 * @param 1 ≦ Pi ≦ N
	 * @param 1 ≦ Xi ≦ 10^5
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int t[] = new int[n];
			int base = 0;
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				base += t[i];
			}
			int m = sc.nextInt();
			int p[] = new int[m];
			int x[] = new int[m];
			for (int i = 0; i < m; i++) {
				p[i] = sc.nextInt();
				x[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				System.out.println(base - t[p[i] - 1] + x[i]);
			}
		}
	}
}