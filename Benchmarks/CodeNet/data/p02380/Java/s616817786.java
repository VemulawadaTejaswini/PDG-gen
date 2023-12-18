import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		double a, b, c;
		double s, l, h;

		Scanner stdIn = new Scanner(System.in);

		a = stdIn.nextDouble();
		b = stdIn.nextDouble();
		c = stdIn.nextDouble();

		s = (((a * b)) * Math.sin(Math.toRadians(c))) / 2.0;
		l = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2.0 * (a * b * Math.cos(Math.toRadians(c)))));
		h = b * Math.sin(Math.toRadians(c));

		System.out.println(s);
		System.out.println(l);
		System.out.println(h);

		stdIn.close();
	}
}