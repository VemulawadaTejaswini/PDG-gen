import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) throws IOException {

		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(3);
		format.setMinimumFractionDigits(3);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String[] s = br.readLine().split(" ");
			double[] x = new double[3];
			double[] y = new double[3];
			for (int i = 0; i < 3; i++) {
				x[i] = Double.parseDouble(s[2 * i]);
				y[i] = Double.parseDouble(s[2 * i + 1]);
			}
			double p = ((y[0] - y[2]) * (y[0] * y[0] - y[1] * y[1] + x[0] * x[0] - x[1] * x[1]) - (y[0] - y[1]) * (y[0] * y[0] - y[2] * y[2] + x[0] * x[0] - x[2] * x[2]))
					/ (2 * (y[0] - y[2]) * (x[0] - x[1]) - 2 * (y[0] - y[1]) * (x[0] - x[2]));
			double q = ((x[0] - x[2]) * (x[0] * x[0] - x[1] * x[1] + y[0] * y[0] - y[1] * y[1]) - (x[0] - x[1]) * (x[0] * x[0] - x[2] * x[2] + y[0] * y[0] - y[2] * y[2]))
					/ (2 * (x[0] - x[2]) * (y[0] - y[1]) - 2 * (x[0] - x[1]) * (y[0] - y[2]));
			double r = Math.sqrt((p - x[0]) * (p - x[0]) + (q - y[0]) * (q - y[0]));
			System.out.println(BigDecimal.valueOf(p).setScale(3, RoundingMode.HALF_UP) + " " + BigDecimal.valueOf(q).setScale(3, RoundingMode.HALF_UP) + " "
					+ BigDecimal.valueOf(r).setScale(3, RoundingMode.HALF_UP));
		}
	}
}