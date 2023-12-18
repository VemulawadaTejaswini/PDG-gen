import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str;
		int[] count = new int[26];
		while ((str = br.readLine()) != null) {
			str = str.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isLetter(c)) {
					count[c - 'a']++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			sb.append((char) ('a' + i)).append(" : ").append(count[i]);
		}
		System.out.print(sb);
	}
}