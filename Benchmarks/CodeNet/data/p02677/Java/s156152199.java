import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		double r1 = h / 12.0 + m / (12.0 * 60);
		r1 *=  Math.PI * 2;
		double x1 = a * Math.cos(r1);
		double y1 = a * Math.sin(r1);

		double r2 = m / 60.0 * Math.PI * 2;
		double x2 = b * Math.cos(r2);
		double y2 = b * Math.sin(r2);

		System.out.println(Math.hypot(x1 - x2, y1 - y2));
	}
}
