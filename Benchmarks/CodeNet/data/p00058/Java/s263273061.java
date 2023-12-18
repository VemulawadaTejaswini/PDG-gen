import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		double x1, y1, x2, y2;
		while (in.hasNext()) {
			x1 = -in.nextDouble();
			y1 = -in.nextDouble();
			x1 += in.nextDouble();
			y1 += in.nextDouble();
			x2 = -in.nextDouble();
			y2 = -in.nextDouble();
			x2 += in.nextDouble();
			y2 += in.nextDouble();
			System.out.println((x1 * x2 + y1 * y2 == 0) ? "YES" : "NO");
		}
	}
}