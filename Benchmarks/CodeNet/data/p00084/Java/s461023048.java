import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringBuilder words = new StringBuilder();
			char c;
			char[] word = new char[6];
			int idx = 0;
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				if (c == ' ' || c == '.' || c == ',' || i == line.length() - 1) {
					if (idx > 2 && idx < 6) {
						words.append(new String(Arrays.copyOf(word, idx)) + " ");
					}
					idx = 0;
				} else {
					if (idx < 6) {
						word[idx] = c;
					}
					idx++;
				}
			}
			System.out.println((words.substring(0, words.length() - 1)));
		}
	}
}