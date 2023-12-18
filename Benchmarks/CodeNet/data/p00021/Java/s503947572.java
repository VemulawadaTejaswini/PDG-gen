import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] s = line.split(" ");
				BigDecimal[] ia = new BigDecimal[s.length];
				for (int i = 0; i < s.length; i++) {
					ia[i] = new BigDecimal(s[i]);
				}
				boolean isParallel = parallel(ia);
				System.out.println(isParallel ? "YES" : "NO");
			}
		}
	}
	public static boolean parallel(BigDecimal[] b) {
		// dx1 / dy1 = dx2 / dy2
		// dx1 * dy2 = dy1 * dx2
		BigDecimal dx1 = b[2].subtract(b[0]);
		BigDecimal dx2 = b[3].subtract(b[1]);
		BigDecimal dy1 = b[6].subtract(b[4]);
		BigDecimal dy2 = b[7].subtract(b[5]);
		return dx1.multiply(dy2).compareTo(dx2.multiply(dy1)) == 0;
	}
}