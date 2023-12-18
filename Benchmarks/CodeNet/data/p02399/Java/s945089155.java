import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final String inputLine = br.readLine();
			final String[] inputNumbers = inputLine.split(" ");

			final Integer a = Integer.valueOf(inputNumbers[0]);
			final Integer b = Integer.valueOf(inputNumbers[1]);

			final Integer d = a / b;
			final Integer r = a % b;
			final Double f = a.doubleValue() / b.doubleValue();

			System.out.format("%d %d %.5f\n", d, r, f);
		}
	}
}

