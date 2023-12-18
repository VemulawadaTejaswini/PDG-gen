import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A Popular Ice-cream Shop
 */
public class Main {

	final static char ASTER_ = '*';
	final static char HYPHEN = '-';
	final static char RETURN = '\n';
	final static int KINDS = 10;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int[] ices = new int[KINDS];
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; ++i) {
				++ices[Integer.parseInt(br.readLine())];
			}
			for (int i = 0; i < KINDS; ++i) {
				if (ices[i] > 0) {
					for (int j = 0; j < ices[i]; ++j) {
						sb.append(ASTER_);
					}
				} else {
					sb.append(HYPHEN);
				}
				sb.append(RETURN);
			}
		}
		System.out.print(sb.toString());
	}
}