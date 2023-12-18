
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
	public static void koch(int n, double p1x, double p1y, double p2x, double p2y) {
		if (n == 0) {
			return;
		}
		double sx = (2 * p1x + 1 * p2x) / 3;
		double sy = (2 * p1y + 1 * p2y) / 3;
		double tx = (1 * p1x + 2 * p2x) / 3;
		double ty = (1 * p1y + 2 * p2y) / 3;
		double ux = (tx - sx) *(double) Math.cos(Math.toRadians(60)) - (ty - sy) * (double)Math.sin(Math.toRadians(60)) + sx;
		double uy = (tx - sx) * (double)Math.sin(Math.toRadians(60)) +(ty - sy) * (double)Math.cos(Math.toRadians(60)) + sy;

		koch(n - 1, p1x, p1y, sx, sy);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",sx)+" "+MessageFormat.format("{0,number,0.00000000}",sy));
		koch(n - 1, sx, sy, ux, uy);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",ux)+" "+MessageFormat.format("{0,number,0.00000000}",uy));
		koch(n - 1, ux, uy, tx, ty);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",tx)+" "+MessageFormat.format("{0,number,0.00000000}",ty));
		koch(n - 1, tx, ty, p2x, p2y);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double p1x = 0;
		double p1y = 0;
		double p2x = 100;
		double p2y = 0;
		System.out.println(MessageFormat.format("{0,number,0.00000000}",p1x)+" "+MessageFormat.format("{0,number,0.00000000}",p1y));
		koch(n, p1x, p1y, p2x, p2y);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",p2x)+" "+MessageFormat.format("{0,number,0.00000000}",p2y));
		scanner.close();

	}

}
