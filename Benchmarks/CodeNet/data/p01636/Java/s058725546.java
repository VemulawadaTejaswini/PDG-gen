import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int i = Integer.parseInt(line);
			int count = 0;
			// a == b
			if (i % 2 == 0) {
				count++;
			}
			// a != b
			for (int j = 1; j < line.length(); j++) {
				if (line.charAt(j) != '0') {
					int l = Integer.parseInt(line.substring(0, j));
					int r = Integer.parseInt(line.substring(j));
					if (l <= r && (r - l) % 2 == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}