import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		while ((s = br.readLine()) != null) {
			String[] array = s.split(" ");
			double a = Double.parseDouble(array[0]);
			double d = Double.parseDouble(array[3]);
			double e = Double.parseDouble(array[4]);
			double f = Double.parseDouble(array[5]);
			double i = d / a;
			if ((0 < d &&  a < 0) || (d < 0 &&  0 < a)) {
				i = i * -1;
			}
			double b = Integer.parseInt(array[1]) * i;
			double c = Integer.parseInt(array[2]) * i;
			double y = (c + f) / (b + e);
			
			double e1 = e * y;
			double x = d / (f - e1);
			
			BigDecimal x1 = new BigDecimal(x);
			BigDecimal y1 = new BigDecimal(y);
			DecimalFormat format = new DecimalFormat("0.000");
			System.out.println(format.format(x1.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue()) + " " + format.format(y1.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue()));
		}
		br.close();
	}
}