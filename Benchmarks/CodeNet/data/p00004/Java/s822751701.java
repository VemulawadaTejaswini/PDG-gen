import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		LinkedList<String> output = new LinkedList<String>();
		double[] p = new double[6];//0a 1b 2c 3d 4e 5f
		while (in.hasNext()) {
			for (int i = 0; i < p.length; i++) {
				p[i] = in.nextDouble();
			}
			double y = (p[2] / p[0] - p[5] / p[3]) / (p[1] / p[0] - p[4] / p[3]);//(c/a-f/d)/(b/a-e/d)
			double x = (p[2] - p[1] * y) / p[0];
			BigDecimal Y = new BigDecimal(y);
			BigDecimal X = new BigDecimal(x);
			Y = Y.setScale(3, BigDecimal.ROUND_HALF_UP);
			X = X.setScale(3, BigDecimal.ROUND_HALF_UP);
			output.add(String.format("%.3f", X) + " " + String.format("%.3f", Y));
		}
		for (int i=0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
}