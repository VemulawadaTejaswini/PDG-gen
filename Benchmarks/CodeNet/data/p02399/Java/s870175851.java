import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int d = a / b;
		int r = a % b;
		BigDecimal aB = new BigDecimal(str[0]);
		BigDecimal bB = new BigDecimal(str[1]);
		DecimalFormat df = new DecimalFormat("0.00000");
		String f = df.format(aB.divide(bB));
		System.out.println(d + " " + r + " " + f);
	}

}