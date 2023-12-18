import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		koch(0, 0, 100, 0, 0, n);
		System.out.format("%.4f %.4f\n", (double)100, (double)0);

    	sc.close();
	}
	
	public static void koch(double x1, double y1, double x2, double y2, int level, int n) {
		if (level == n) {
			System.out.format("%.4f %.4f\n", x1, y1);
		} else {
			double xs = (x2 - x1) / 3 + x1;
			double ys = (y2 - y1) / 3 + x1;
			double xt = (x2 - x1) * 2 / 3 + x1;
			double yt = (y2 - y1) * 2 / 3 + x1;
			double l = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) / 3;
			double theta = Math.atan2(y2 - y1, x2 - x1) + Math.PI / 3;
			double xu = xs + l * Math.cos(theta);
			double yu = ys + l * Math.sin(theta);
			
			koch(x1, y1, xs, ys, level + 1, n);
			koch(xs, ys, xu, yu, level + 1, n);
			koch(xu, yu, xt, yt, level + 1, n);
			koch(xt, yt, x2, y2, level + 1, n);
		}
	}
}