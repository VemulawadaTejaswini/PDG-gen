import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			char c;
			int n;
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				if (c == '@') {
					n = line.charAt(++i) - '0';
					c = line.charAt(++i);
					for (int j = 0; j < n; j++) {
						System.out.print(c);
					}
				} else {
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}
	}
}