import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			BigDecimal a, b, dec;
			String decstr;
			int n, sum = 0;

			a = new BigDecimal(line.split(" ")[0]).setScale(10);
			b = new BigDecimal(line.split(" ")[1]).setScale(10);
			n = Integer.parseInt(line.split(" ")[2]);

			dec = a.divide(b, 10, RoundingMode.HALF_UP);
			decstr = dec.toString().split("\\.")[1] + "000000000";

			for (int i = 0; i < n; i++) {
				sum += decstr.charAt(i) - 48;
			}
			System.out.println(sum);
		}
	}
}