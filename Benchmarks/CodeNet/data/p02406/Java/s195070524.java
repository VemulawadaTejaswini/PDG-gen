import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			for (int i = 3; i <= n; i++) {
				if (i % 3 == 0 || i % 10 == 3) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}
	}
}