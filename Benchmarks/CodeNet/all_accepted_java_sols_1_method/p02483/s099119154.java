import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x;

		if (b >= c) {
			x = c;
			c = b;
			b = x;

		}
		if (a > b) {
			x = b;
			b = a;
			a = x;
			if (b > c) {
				x = c;
				c = b;
				b = x;
			}
		}

		System.out.printf("%d %d %d\n", a, b, c);

	}

}