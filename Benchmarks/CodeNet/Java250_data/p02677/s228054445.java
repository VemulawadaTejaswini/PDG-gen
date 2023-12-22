import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		double m = scan.nextDouble();

		double ah = 0;
		double am = 0;
		am = m * 6;
		ah = h * 30 + m / 2;

		double angle = Math.abs(am - ah);
		if(angle > 180) {
			angle = 360 - angle;
		}

		// System.out.println(angle);

		double r=Math.sqrt(Math.pow(b,2)+Math.pow(a,2)-2*b*a*Math.cos(Math.toRadians(angle)));

		System.out.println(r);

	}
}