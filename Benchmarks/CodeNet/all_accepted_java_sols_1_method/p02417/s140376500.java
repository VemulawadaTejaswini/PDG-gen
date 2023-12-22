import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int[] charCount = new int[26];
	public static final StringBuilder sb = new StringBuilder();
	public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String... args) throws IOException {
		while (true) {
			final int charactor = br.read();
			if (97 <= charactor && charactor <= 123) {
				charCount[charactor - 97]++;
			} else if (65 <= charactor && charactor <= 91) {
				charCount[charactor - 65]++;
			} else if (charactor == -1) {
				break;
			}
		}

		for (int i = 0; i < 26; i++) {
			sb.append(((char) (i + 97))).append(" : ").append(charCount[i]).append(i != 25 ? '\n' : "");
		}

		System.out.println(sb);
	}
}