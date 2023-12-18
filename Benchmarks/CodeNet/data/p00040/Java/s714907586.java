
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
		char[] chs = new char[a.length()];
		for (int k = 0; k < a.length(); k++) {
			if ('a' <= a.charAt(k) && a.charAt(k) <= 'z') {
				int b = a.charAt(k) - 97;
				chs[k] = (char) ((b * i + j) % 26 + 97);
			}
			else{
				chs[k] = a.charAt(k);
			}
		}
		return String.valueOf(chs);
	}
}