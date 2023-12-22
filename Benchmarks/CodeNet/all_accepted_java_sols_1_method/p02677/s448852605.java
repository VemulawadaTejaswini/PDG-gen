import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt(), m = sc.nextInt();
		double mAngle = m / 60. * 360;
		double hAngle = h / 12. * 360 + mAngle / 360 * 30;
		double diff = Math.abs(mAngle - hAngle);
		double C = Math.min(diff, 360 - diff);
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(C * Math.PI / 180));
		System.out.println(c);
	}
}
