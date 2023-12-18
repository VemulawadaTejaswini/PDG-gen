import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int C = Integer.parseInt(line[2]);

			double[] ret = new double[3];
			double S = a * b * Math.sin(Math.toRadians(C)) / 2;
			double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
			double h = Math.sin(Math.toRadians(C)) * b;
			ret[0] = S;
			ret[1] = L;
			ret[2] = h;

			int i;
			for (i = 0; i < ret.length; i++) {
				System.out.println(String.format("%.8f", ret[i]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}