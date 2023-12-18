import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		DecimalFormat format = new DecimalFormat("#.#");
        format.setMinimumFractionDigits(3);
        format.setMaximumFractionDigits(3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();

			while (str != null) {

				String[] nums = str.split(" ", 0);

				BigDecimal a = new BigDecimal(Integer.parseInt(nums[0]));
				BigDecimal b = new BigDecimal(Integer.parseInt(nums[1]));
				BigDecimal c = new BigDecimal(Integer.parseInt(nums[2]));
				BigDecimal d = new BigDecimal(Integer.parseInt(nums[3]));
				BigDecimal e = new BigDecimal(Integer.parseInt(nums[4]));
				BigDecimal f = new BigDecimal(Integer.parseInt(nums[5]));

				BigDecimal xTemp = c.divide(a, 3, BigDecimal.ROUND_HALF_UP);
				BigDecimal xTemp2 = b.divide(a, 3, BigDecimal.ROUND_HALF_UP);
				BigDecimal x = new BigDecimal(0.000);
				BigDecimal y = new BigDecimal(0.000);
				y = f.subtract((c.multiply(d).divide(a,  3, BigDecimal.ROUND_HALF_UP)))
							.divide(e.subtract((b.multiply(d).divide(a,  3, BigDecimal.ROUND_HALF_UP))));
				x = (c.subtract(b.multiply(y))).divide(a,  3, BigDecimal.ROUND_HALF_UP);


				System.out.println(format.format(x) + " " + format.format(y));
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}