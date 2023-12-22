import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(3);
		format.setMinimumFractionDigits(3);
		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int e = s.nextInt();
			int f = s.nextInt();
			int nx = b * f - e * c;
			int dx = b * d - e * a;
			int ny = a * f - d * c;
			int dy = a * e - d * b;
			double x = nx == 0 ? nx : (double) nx / dx;
			double y = ny == 0 ? ny : (double) ny / dy;
			System.out.println(format.format(x) + " " + format.format(y));
		}
	}
}