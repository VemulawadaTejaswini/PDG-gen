import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b) {
			if (b < c) {
				// abc
				System.out.printf("%d %d %d\n", a, b, c);
			} else if (a < c) {
				// acb
				System.out.printf("%d %d %d\n", a, c, b);
			} else {
				// cab
				System.out.printf("%d %d %d\n", c, a, b);
			}
		} else {
			if (c < b) {
				// cba
				System.out.printf("%d %d %d\n", c, b, a);
			} else if (c < a) {
				// bca
				System.out.printf("%d %d %d\n", b, c, a);
			} else {
				// bac
				System.out.printf("%d %d %d\n", b, a, c);
			}
		}
	}
}