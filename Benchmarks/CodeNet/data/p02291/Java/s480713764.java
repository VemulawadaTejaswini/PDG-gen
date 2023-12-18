import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x_p1 = scan.nextDouble();
		double y_p1 = scan.nextDouble();
		double x_p2 = scan.nextDouble();
		double y_p2 = scan.nextDouble();
		double vx = x_p2 - x_p1;
		double vy = y_p2 - y_p1;
		int q = scan.nextInt();
		double l = norm(x_p1, y_p1, x_p2, y_p2);

		for(int i = 0; i < q; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double ux = x - x_p1;
			double uy = y - y_p1;
			double t = dot(ux, uy, vx, vy);
			double k = t / l;
			double ax = k * vx + x_p1;
			double ay = k * vy + y_p1;
			double bx = 2 * ax - x;
			double by = 2 * ay - y;
			System.out.println(bx + " " + by);
		}
		scan.close();

	}
	static double dot(double x1, double y1, double x2, double y2) {
		return x1 * x2 + y1 * y2;
	}
	static double norm(double x1, double y1, double x2, double y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
}
