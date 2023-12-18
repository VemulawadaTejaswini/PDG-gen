import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final String inputLine = br.readLine();

			final Double r = Double.valueOf(inputLine);

			final Double area = r * r * Math.PI;
			final Double circumference = 2 * Math.PI * r;

			System.out.format("%f %f\n", area, circumference);
		}
	}
}
