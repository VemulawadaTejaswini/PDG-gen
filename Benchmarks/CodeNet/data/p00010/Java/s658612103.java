import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int p = 0; p < n; p++) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			
			double a1 = 2 * (x2 - x1);
			double b1 = 2 * (y2 - y1);
			double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
			double a2 = 2 * (y3 - y1);
			double b2 = 2 * (y3 - y1);
			double c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;
			
			double px = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
			double py = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
			double r = Math.sqrt((px - x1) * (px - x1) + (py - y1) * (py - y1));
			
			System.out.printf("%.3f %.3f %.3f\n", px, py, r);
		}
	}

}