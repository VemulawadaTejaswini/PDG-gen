import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		Clock clock = new Clock(stdIn.nextInt(), stdIn.nextInt());

		System.out.println(clock.getDist(a, b));

		stdIn.close();
	}
}

class Clock {
	private int h;
	private int m;

	public int getH() {
		return h;
	}

	public int getM() {
		return m;
	}

	public Clock(int h, int m) {
		this.h = h;
		this.m = m;
	}

	public double getAngle() {
		double bAngle = 6 * m;
		double aAngle = 30 * h + 0.5 * m;

		if (Math.abs(bAngle - aAngle) > 180) {
			return 360 - Math.abs(bAngle - aAngle);
		}
		return Math.abs(bAngle - aAngle);
	}

	public double getDist(int a, int b) {

		double angle = getAngle();

		if(angle == 0) {
			return Math.abs(a-b);
		}
		if(angle == 180) {
			return a+b;
		}

		return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.PI * (getAngle() / 180)));
	}
}