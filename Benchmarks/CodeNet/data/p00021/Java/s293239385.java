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
				boolean isParallel = Math.abs(slope(ia[2], ia[3], ia[0], ia[1]).doubleValue())
						 == Math.abs(slope(ia[6], ia[7], ia[4], ia[5]).doubleValue());
				System.out.println(isParallel ? "YES" : "NO");
			}
		}
	}
	public static BigDecimal slope(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2) {
		BigDecimal dy = y2.subtract(y1);
		if (dy.compareTo(BigDecimal.ZERO) == 0) {
			return BigDecimal.ZERO;
		}
		BigDecimal dx = x2.subtract(x1);
		return dx.divide(dy);
	}
}