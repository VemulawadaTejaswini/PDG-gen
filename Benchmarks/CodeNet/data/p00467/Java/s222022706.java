import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) > 0 && (m = in.nextInt()) > 0) {
			int[] sugoroku = new int[n];
			for (int i = 1; i <= n; i++) {
				sugoroku[n - i] = in.nextInt();
			}
			int maxC = m;
			while (m-- > 0) {
				if (n > 1) {
					int saikoro = in.nextInt();
					n -= saikoro;
					if (n >= 1) {
						n -= sugoroku[n - 1];
					}
					if (n <= 1) {
						System.out.println(maxC - m);
					}
				} else {
					in.next();
				}
			}
		}
	}
}