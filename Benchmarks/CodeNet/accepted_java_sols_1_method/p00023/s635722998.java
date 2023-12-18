import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		double r1, r2;
		double x1, x2, y1, y2;
		double length;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			r1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			r2 = sc.nextDouble();
			length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			if (length < Math.abs(r2 - r1)) {
				if (r2 < r1) {
					System.out.println("2");
				} else {
					System.out.println("-2");
				}
			} else if (length <= r1 + r2) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}