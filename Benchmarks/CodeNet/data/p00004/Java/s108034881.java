import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		LinkedList<String> output = new LinkedList<String>();
		double[] p = new double[6];//0a 1b 2c 3d 4e 5f
		double a, b, c, d, e, f;
		while (in.hasNext()) {
			for (int i = 0; i < p.length; i++) {
				p[i] = in.nextDouble();
			}
			a = p[0];
			b = p[1];
			c = p[2];
			d = p[3];
			e = p[4];
			f = p[5];
			double y = (c * d - a * f) / (b * d - a * e);
			double x = (c * e - b * f) / (a * e - b * d);
			if (x == -0.0) {
				x = 0.0;
			}
			if (y == 0.0) {
				y = 0.0;
			}
			output.add(String.format("%.3f %.3f\n", x, y));
		}
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
}