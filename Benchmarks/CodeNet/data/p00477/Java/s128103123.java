import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int i = 0, sum = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			i++;
			sum += Integer.parseInt(line);
			if (i == 4) {
				System.out.print(sum / 60 + "\n" + sum % 60 + "\n");
				i = 0;
			}
		}
	}
}