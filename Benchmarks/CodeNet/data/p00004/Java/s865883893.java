import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		while (in.hasNextInt()) {
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			d = in.nextDouble();
			e = in.nextDouble();
			f = in.nextDouble();
			b /= a;
			c /= a;
			a /= a;
			e /= d;
			f /= d;
			d /= d;
			y = (c-f)/(b-e);
			x = c - b*y;
			System.out.println(x+" "+y);
		}
	}
}