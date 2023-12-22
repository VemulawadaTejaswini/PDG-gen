import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		double x1, y1, x2, y2;

		Scanner stdIn = new Scanner(System.in);

		x1 = stdIn.nextDouble();
		y1 = stdIn.nextDouble();
		x2 = stdIn.nextDouble();
		y2 = stdIn.nextDouble();

		System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		stdIn.close();
	}
}