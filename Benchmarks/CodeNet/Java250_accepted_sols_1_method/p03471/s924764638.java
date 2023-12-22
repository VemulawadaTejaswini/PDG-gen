import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int x, y, z, a, b, c;
		Scanner sc = new Scanner(System.in);
		a = 0;
		x = sc.nextInt();
		y = sc.nextInt();

		y = y / 1000;

		if (y < x) {
			System.out.println("-1 -1 -1");
		} else if (y == x) {
			System.out.println( "0 0 "+y);
		} else {
			z = y - x;
			while (z % 9 != 0) {
				z = z - 4;
				a++;

			}
			// a=a;
			b = z / 9;
			c = x - a - b;

			if (a < 0 || b < 0 || c < 0) {
				System.out.println("-1 -1 -1");

			} else {
				System.out.println(b + " " + a + " " + c);
			}
		}

	}
}
