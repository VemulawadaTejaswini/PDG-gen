import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			double mag = (double) d / a;
			double y = (mag * c - f) / (mag * b - e);
			double x = (f - e * y) / d;
			if (x == 0) {
				x = Math.abs(x);
			}
			if (y == 0) {
				y = Math.abs(y);
			}
			System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
		}
		for (String text : ret) {
			System.out.println(text);
		}
	}
}