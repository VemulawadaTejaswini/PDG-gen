import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a < b) && (a < c) && (b < c)) {
			System.out.printf("%d %d %d\n", a, b, c);
		} else if ((a < b) && (a < c) && (c < b)) {
			System.out.printf("%d %d %d\n", a, c, b);
		} else if ((b < a) && (b < c) && (a < c)) {
			System.out.printf("%d %d %d\n", b, a, c);
		} else if ((b < a) && (b < c) && (c < a)) {
			System.out.printf("%d %d %d\n", b, c, a);
		} else if ((c < a) && (c < b) && (a < b)) {
			System.out.printf("%d %d %d\n", c, a, b);
		} else if ((c < a) && (c < b) && (b < a)) {
			System.out.printf("%d %d %d\n", c, b, a);
		}

	}
}