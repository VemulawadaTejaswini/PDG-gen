import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int n;

		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if ((a | b | c) == 0) {
				break;
			}
			n = sc.nextInt();

			int swap = a;
			a = Math.min(a, b);
			b = Math.min(Math.max(swap, b), c);
			
			double k = Math.sqrt(1.0 * a * a + b * b);
			for (int i = 0; i < n; i++) {
				int r = sc.nextInt();
				if (k / 2 < r) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}
}