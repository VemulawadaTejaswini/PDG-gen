import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int taisyoInt = Integer.parseInt(line);

		for (int i = 3; i <= taisyoInt; i++) {
			if ((i % 3 == 0) || (i % 10 == 3)) {
				System.out.printf(" " + i);
			}
		}
	}
}