import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lunch
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short p0, p1, j0, j1;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			p0 = Short.MAX_VALUE;
			p0 = (p1 = Short.parseShort(line)) < p0 ? p1 : p0;
			p0 = (p1 = Short.parseShort(br.readLine())) < p0 ? p1 : p0;
			p0 = (p1 = Short.parseShort(br.readLine())) < p0 ? p1 : p0;

			j0 = Short.MAX_VALUE;
			j0 = (j1 = Short.parseShort(br.readLine())) < j0 ? j1 : j0;
			j0 = (j1 = Short.parseShort(br.readLine())) < j0 ? j1 : j0;

			System.out.println(p0 + j0 - 50);
		}
	}
}