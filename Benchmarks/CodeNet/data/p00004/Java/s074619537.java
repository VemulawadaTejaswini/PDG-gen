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
			System.out.println(format.format((double) (b * f - e * c) / (double)(b * d - e * a)) + " " + format.format((double) (d * c - a * f) / (double)(d * b - a * e)));
		}
	}
}