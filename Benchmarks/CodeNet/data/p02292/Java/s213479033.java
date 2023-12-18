import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x_p0 = scan.nextDouble();
		double y_p0 = scan.nextDouble();
		double x_p1 = scan.nextDouble();
		double y_p1 = scan.nextDouble();
		double vx = x_p1 - x_p0;
		double vy = y_p1 - y_p0;
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double ux = x - x_p0;
			double uy = y - y_p0;
			double t = dot(ux, uy, vx, vy);
			double f = 0.00000001;
			if(cross(vx, vy, ux, uy) > f) {
				System.out.println("COUNTER_CLOCKWISE");
			}else if(cross(vx, vy, ux, uy) < -f){
				System.out.println("CLOCKWISE");
			}else if(dot(vx, vy, ux, uy) < -f) {
				System.out.println("ONLINE_BACK");
			}else if(norm(vx, vy) < norm(ux, uy)) {
				System.out.println("ONLINE_FRONT");
			}else {
				System.out.println("ON_SEGMENT");
			}
		}
		scan.close();

	}
	static double dot(double x1, double y1, double x2, double y2) {
		return x1 * x2 + y1 * y2;
	}
	static double norm(double x1, double y1, double x2, double y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
	static double norm(double x, double y) {
		return x * x + y * y;
	}
	static double cross(double x1, double y1, double x2, double y2) {
		return x1 * y2 - y1 * x2;
	}
}
