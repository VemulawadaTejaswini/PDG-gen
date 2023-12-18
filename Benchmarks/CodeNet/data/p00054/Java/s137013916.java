import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			double a, b, dec;
			int n, sum = 0;

			a = Double.parseDouble(line.split(" ")[0]);
			b = Double.parseDouble(line.split(" ")[1]);
			n = Integer.parseInt(line.split(" ")[2]);
			dec = (a / b) % 1;

			for (int i = 1; i <= n; i++) {
				dec *= 10;
				dec %= 10;
				sum += (int) dec;
			}
			System.out.println(sum);
		}
	}
}