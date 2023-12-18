import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {

	private static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args)
			throws IOException {

		try {
			Integer week = Integer.parseInt(br
					.readLine());

			int i = week.intValue();
			BigDecimal amount = new BigDecimal(
					"100000");
			BigDecimal interest;
			while (i > 0) {
				interest = amount.multiply(
						new BigDecimal("0.05"));
				amount = amount.add(interest);
				i--;
			}
			System.out.println(amount.setScale(-4,
					BigDecimal.ROUND_HALF_UP)
					.intValue());
		} catch (NumberFormatException e) {
			br.close();
			e.printStackTrace();
		} catch (IOException e) {
			br.close();
			e.printStackTrace();
		}

	}

}