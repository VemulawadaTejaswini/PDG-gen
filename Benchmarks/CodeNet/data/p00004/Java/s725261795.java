import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.000");
		String line;
		while ((line = br.readLine()) != null) {
			String[] tmp = line.split(" ");
			double[] values = toDoubleArray(tmp);
			double x = (values[2] * values[4] - values[1] * values[5]) / (values[0] * values[4] - values[1] * values[3]);
			double y = (values[2] * values[3] - values[0] * values[5]) / (values[1] * values[3] - values[0] * values[4]);

			x = new BigDecimal(x).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
			y = new BigDecimal(y).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
			sb.append(df.format(x)).append(" ").append(df.format(y)).append("\n");
		}

		System.out.print(sb.toString());
	}

	public static double[] toDoubleArray(String[] lines) {
		double[] doubles = new double[lines.length];
		for (int i = 0; i < lines.length; i++) {
			doubles[i] = Double.parseDouble(lines[i]);
		}
		return doubles;
	}
}