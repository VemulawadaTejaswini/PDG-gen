import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
		String line = "";
		while ((line = br.readLine()) != null) {
			double data = Double.parseDouble(line);
			max = Math.max(max, data);
			min = Math.min(min, data);
		}
		System.out.println(max - min);

	}

}