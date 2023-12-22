import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sugoroku
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {
			short n = Short.parseShort(line.substring(0, line.indexOf(' ')));
			short m = Short.parseShort(line.substring(line.indexOf(' ') + 1));
			short[] s = new short[n];
			for (int i = 0; i < n; i++) {
				s[i] = Short.parseShort(br.readLine());
			}
			//
			int t = 0, c = 0;
			for (int i = 0; i < m; i++) {
				if (t < n) {
					t += Short.parseShort(br.readLine());
					if (t < n) {
						t += s[t];
					}
					c = i;
				} else {
					br.readLine();
				}
			}
			System.out.println(c + 1);
		}
	}
}