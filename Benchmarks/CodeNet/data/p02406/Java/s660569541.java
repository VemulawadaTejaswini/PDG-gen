import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			System.out.print("3");
			for (int i = 3; i <= n; i++) {
				if (i % 3 == 0 || i % 10 == 3) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}
	}
}