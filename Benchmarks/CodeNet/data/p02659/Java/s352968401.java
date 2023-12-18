import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
		String[] arrayLine = line.split(" ",0);
        BigDecimal A = new BigDecimal(arrayLine[0]);
        BigDecimal B = new BigDecimal(arrayLine[1]);
        BigDecimal out = A.multiply(B);
        System.out.println(out.stripTrailingZeros().toPlainString());
    }

    private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}