import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double[][] p = new double[3][2];
			for (int i = 0; i < 3; i++) {
				p[i][0] = sc.nextDouble();
				p[i][1] = sc.nextDouble();
			}
			double px = sc.nextDouble();
			double py = sc.nextDouble();

			boolean f = true;
			boolean g = true;
			
			for (int i = 0; i < 3; i++) {
				double point = checkPointPlace(p[i][0], p[i][1], p[(i + 1) % 3][0],
						p[(i + 1) % 3][1], px, py);
				if (point >= 0) {
					f = false;
				}
				if (point <= 0) {
					g = false;
				}
			}
			if (f || g) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static double checkPointPlace(double x, double y, double x1, double y1,
			double x2, double y2) {
		double a = x1 - x;
		double b = y1 - y;
		double c = x2 - x;
		double d = y2 - y;
		
		return a * d - c * b;
	}

}