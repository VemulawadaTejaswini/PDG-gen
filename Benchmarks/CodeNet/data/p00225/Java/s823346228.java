import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem J: Kobutanukitsuneko
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			int[] sta = new int[26];
			int[] end = new int[26];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				char s, e;
				s = line.charAt(0);
				e = line.charAt(line.length() - 1);
				if (s != e) {
					sta[s - 'a']++;
					end[e - 'a']++;
				}
			}
			boolean avail = true;
			for (int i = 0; i < 26; i++) {
				if (sta[i] == end[i]) {
					avail &= true;
				} else {
					avail &= false;
				}
			}
			System.out.println(avail ? "OK" : "NG");
		}
	}
}