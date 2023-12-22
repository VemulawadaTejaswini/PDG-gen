import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if (n == 0 && m == 0)
				break;

			//
			m++;
			int[] wish = new int[m];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				for (int j = 0; j < line.length(); j += 2) {
					wish[j / 2 + 1] += (line.charAt(j) - '0');
				}
			}

			//
			StringBuilder sb = new StringBuilder();
			for (int i = n; i >= 0; i--) {
				for (int j = 1; j < m; j++) {
					if (wish[j] == i)
						sb.append(j + " ");
				}
			}
			System.out.println(sb.toString().substring(0, sb.length() - 1));
		}
	}
}