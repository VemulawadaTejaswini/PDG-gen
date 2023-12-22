import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		double numR = 0.0;

		//?§£????????°
		double circle = 0.0;
		double area = 0.0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String Input = br.readLine();

			numR = Double.parseDouble(Input);
			area = Math.PI * (numR * numR);
			circle = Math.PI * (2 * numR);
			System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", circle));

		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}