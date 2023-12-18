import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = br.readLine();

		double min = Double.MIN_VALUE;
		double max = Double.MAX_VALUE;

		while ((line = br.readLine()) != null) {

			if (max < Double.valueOf(line)) {

				max = Double.valueOf(line);

			}

			if (min > Double.valueOf(line)) {

				min = Double.valueOf(line);

			}
		}

		System.out.println(max-min);
		
	}

}