import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			BigDecimal h = new BigDecimal(chr[0]);
			BigDecimal a = new BigDecimal(chr[1]);

			BigDecimal div = h.divide(a, BigDecimal.ROUND_UP);
			 System.out.println(div);
		}
	}
}