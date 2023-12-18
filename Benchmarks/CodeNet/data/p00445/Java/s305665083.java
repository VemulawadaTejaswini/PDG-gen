import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JOI and IOI
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int len = line.length() - 1;
			int joi = 0;
			int ioi = 0;

			for (int i = 1; i < len; i++) {
				if (line.charAt(i) == 'O') {
					if (line.charAt(i + 1) == 'I') {
						if (line.charAt(i - 1) == 'J') {
							joi++;
						} else if (line.charAt(i - 1) == 'I') {
							ioi++;
						}
					}
				}
			}
			//
			System.out.println(joi + "\n" + ioi);
		}
	}
}