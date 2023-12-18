import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			int number = Integer.parseInt(str[0]);
			double weight = Double.parseDouble(str[1]);
			double high = Double.parseDouble(str[2]);
			double bmi = weight / (high * high);
			if (bmi >= 25) System.out.println(number);
			line = null;
		}

	}

}