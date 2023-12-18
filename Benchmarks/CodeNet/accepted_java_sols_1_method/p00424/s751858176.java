import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n = 0;
		char[] conv = new char[123];
		StringBuilder sb = new StringBuilder();

		while ((line = br.readLine()) != null) {
			if (n == 0) {
				if ((n = Integer.parseInt(line)) == 0)
					break;
			} else {
				if (line.contains(" ")) {
					conv[line.charAt(0)] = line.charAt(2);
				} else {
					if (conv[line.charAt(0)] != '\0')
						sb.append(conv[line.charAt(0)]);
					else
						sb.append(line);
				}
				n--;
				if (n == 0 && line.length() == 1) {
					System.out.println(sb.toString());
					conv = new char[123];
					sb = new StringBuilder();
				}
			}
		}
	}
}