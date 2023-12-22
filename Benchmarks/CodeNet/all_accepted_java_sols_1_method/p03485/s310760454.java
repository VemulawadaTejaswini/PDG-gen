import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			BigDecimal a = new BigDecimal(chr[0]);
			BigDecimal b = new BigDecimal(chr[1]);
			BigDecimal di = new BigDecimal("2");
			BigDecimal ans = (a.add(b)).divide(di);
			System.out.println(ans.setScale(0,RoundingMode.UP));

		}
	}
}