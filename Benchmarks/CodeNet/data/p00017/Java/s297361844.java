
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;
		String line;
		String result;
		while ((line = reader.readLine()) != null) {

			int[] lines = new int[line.length()];
			for (int i = 0; i < line.length(); i++) {
				lines[i] = line.codePointAt(i);
			}
			int t = 0;
			while (true) {

				char[] cs = new char[lines.length];
				for (int i = 0; i < lines.length; i++) {
					cs[i] = (char) lines[i];
				}

				result = String.valueOf(cs);
				if (result.contains("the") || result.contains("this")
						|| result.contains("that")) {
					break;
				}
				for (int i = 0; i < lines.length; i++) {
					if (lines[i] >= 'a') {
						lines[i] = lines[i] + 1;
						if (lines[i] > 'z')
							lines[i] -= 26;
					}
				}
				
			}
			System.out.println(result);

		}
	}
}