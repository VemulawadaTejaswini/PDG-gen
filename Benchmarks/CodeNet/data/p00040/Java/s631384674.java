
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		Pattern pattern = Pattern.compile("that|this");
		while (n-- > 0) {
			String result = reader.readLine();
			String a = result;
			loop: for (int i = 1; i < 26; i = i + 2) {
				for (int j = 0; j < 26; j++) {
					a = rep(result, i, j);
					
					if (pattern.matcher(a).find()) {
						builder.append(a).append('\n');
						break loop;
					}
				}
			}
		}
		System.out.print(builder);
	}

	private static String rep(String a, int i, int j) {
		char[] chs = a.toCharArray();
		for (int k = 0; k < a.length(); k++) {
			if ('a' <= chs[k] && chs[k] <= 'z') {
				int b = chs[k] - 'a';
				chs[k] = (char) ((b * i + j) % 26 + 'a');
			}
		}
		return String.valueOf(chs);
	}
}