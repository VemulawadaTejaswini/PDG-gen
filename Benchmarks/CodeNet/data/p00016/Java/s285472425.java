import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int steps, angle;
		double x = 0;
		double y = 0;
		double sumAngle = 0;

		while (true) {

			String[] temp = input().split(",");

			steps = Integer.parseInt(temp[0]);
			angle = Integer.parseInt(temp[1]);

			if (steps == 0 && angle == 0) {

				break;

			}

			x += steps * Math.cos(Math.toRadians(90 - sumAngle));
			y += steps * Math.sin(Math.toRadians(90 - sumAngle));
			sumAngle += angle;

		}

		System.out.println((int)x);
		System.out.println((int)y);

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}