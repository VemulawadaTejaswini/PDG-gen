import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 3 && n <= 10000) {
			int i = 1;
			int x, a, b, c;
			a = 0;
			b = 13;
			c = 0;
			if (n % 3 == 0) {
				x = n / 3;
			} else {
				n = n - n % 3;
				x = n / 3;
			}
			for (i = 1; i <= x; i++) {
				a = a + 3;
				if (a >= b) {
					System.out.printf(" %d", b);
					c = b;
					b = b + 10;
				}
				if (a != c) {
					System.out.printf(" %d", a);
				}
			}
			sc.close();
		}
	}
}