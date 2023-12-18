import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int sum = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			sum += parseInt(line) >= 40 ? parseInt(line) : 40;
		}
		System.out.println(sum / 5);

	}

}