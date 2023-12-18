import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> x = new ArrayList<Double>();
		ArrayList<Double> y = new ArrayList<Double>();
		double g_x = 0.0;
		double g_y = 0.0;
		try {
			while (true) {
				String in[] = sc.nextLine().split(",");
				x.add(Double.parseDouble(in[0]));
				y.add(Double.parseDouble(in[1]));
				g_x += x.get(x.size() - 1);
				g_y += y.get(y.size() - 1);
			}
		} catch (Exception e) {
		}
		g_x /= x.size();
		g_y /= y.size();
		double s = 0.0;
		for (int i = 0; i < x.size(); i++) {
			double a = dist(x.get(i), y.get(i), g_x, g_y);
			double b = dist(x.get((i + 1) % x.size()),
					y.get((i + 1) % y.size()), g_x, g_y);
			double c = dist(x.get(i), y.get(i), x.get((i + 1) % x.size()),
					y.get((i + 1) % y.size()));
			double z = (a + b + c) / 2;
			s += Math.sqrt(z * (z - a) * (z - b) * (z - c));
		}
		System.out.println(s);
	}

	static double dist(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}