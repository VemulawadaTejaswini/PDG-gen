import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			for (char c : line.toCharArray()) {
				c -= 3;
				if (c < 'A')
					c += 26;
				sb.append(c);
			}
			System.out.println(sb.toString());
		}
	}
}