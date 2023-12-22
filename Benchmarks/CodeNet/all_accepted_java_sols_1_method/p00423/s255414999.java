import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		int a, b, suma, sumb;
		a = b = suma = sumb = 0;

		br.readLine();
		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line);
			if (st.countTokens() > 1) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				if (a > b) {
					suma += (a + b);
				} else if (a < b) {
					sumb += (a + b);
				} else {
					suma += a;
					sumb += b;
				}
			} else {
				System.out.println(suma + " " + sumb);
				suma = sumb = 0;
			}
		}
	}
}