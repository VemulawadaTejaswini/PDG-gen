import java.util.Scanner;

public class Main {

	// ２点間の距離
	public static double getDistance (double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static double[] func1 (double x1, double y1, double x2, double y2, double x3, double y3) {
		double a1 = 2 * (x2 - x1);
		double b1 = 2 * (y2 - y1);
		double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
		double a2 = 2 * (x3 - x1);
		double b2 = 2 * (y3 - y1);
		double c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;
		double x = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
		double y = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
		return new double[]{x, y};
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double[] ans = func1(x1,y1,x2,y2,x3,y3);
			double ans3 = getDistance(ans[0],ans[1],x1,y1);
			System.out.printf("%.3f %.3f %.3f\n", ans[0], ans[1], ans3);
		}
	}

}