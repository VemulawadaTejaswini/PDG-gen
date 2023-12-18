import java.util.Scanner;

public class Main {
	private double x, y;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double xp = scan.nextDouble();
			double yp = scan.nextDouble();
			
			double[] b12 = {x2 - x1, y2 - y1};
			double[] b13 = {x3 - x1, y3 - y1};
			double[] b1p = {xp - x1, yp - y1};
			
			matrix(b12[0], b13[0], b12[1], b13[1], b1p[0], b1p[1]);
			
			//debug();
			if (this.x < 0 || this.y < 0) {
				System.out.println("NO");
				continue;
			}
			
			double[] b21 = {x1 - x2, y1 - y2};
			double[] b23 = {x3 - x2, y3 - y2};
			double[] b2p = {xp - x2, yp - y2};
			
			matrix(b21[0], b23[0], b21[1], b23[1], b2p[0], b2p[1]);
			
			//debug();
			if (this.x < 0 || this.y < 0) {
				System.out.println("NO");
				continue;
			}
			
			System.out.println("YES");
		}
	}
	
	private void debug() {
		System.out.println(x + " " + y);
	}
	
	private void matrix(double a, double b, double c, double d, double e, double f) {
			if (a * d - b * c != 0) {
				this.x = (e * d - b * f) / (a * d - b * c);
				this.y = (a * f - e * c) / (a * d - b * c);
			}else {
				this.x = -1;
				this.y = -1;
			}
	}

}