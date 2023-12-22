import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int i = Integer.parseInt(s);

        BigDecimal l = new BigDecimal(i);
        BigDecimal divide = l.divide(new BigDecimal(3), 10, RoundingMode.HALF_DOWN);

        BigDecimal pow = divide.pow(3);

        System.out.println(pow.toString());
    }

}
