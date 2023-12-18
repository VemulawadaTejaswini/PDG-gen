import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = br.readLine();

		Double min = 10000.0;
		Double max = 0.0;

		while ((line = br.readLine()) != null) {

			if (max < Double.valueOf(line)) {

				max = Double.valueOf(line);

			}
			System.out.println(max);

			if (min > Double.valueOf(line)) {

				min = Double.valueOf(line);

			}
		}

		BigDecimal bi = new BigDecimal(String.valueOf(max - min));

		System.out.println((bi.setScale(1, BigDecimal.ROUND_HALF_UP)
				.doubleValue()));

	}

}