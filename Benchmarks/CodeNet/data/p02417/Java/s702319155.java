import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while ((line = reader.readLine().toLowerCase()) != null) {
				int[] count = new int[26];
				for (int i = 0; i < 26; i++) {
					count[i] = 0;
				}
				for (int i = 0; i < line.length(); i++) {
					int ch = line.charAt(i) - 'a';
					if (ch >= 0 && ch < 26) {
						count[ch]++;
					}
				}
				for (int i = 0; i < 26; i++) {
					char alp = (char) ('a' + i);
					System.out.println(alp + " : " + count[i]);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

