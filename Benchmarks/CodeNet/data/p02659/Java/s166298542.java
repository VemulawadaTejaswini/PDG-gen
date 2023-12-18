import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] in = br.readLine().split(" ");
            long a = Long.parseLong(in[0]);
            double b = Double.parseDouble(in[1]);

            br.close();

            BigDecimal x = new BigDecimal(a);
            BigDecimal y = new BigDecimal(b);

            System.out.println(x.multiply(y).setScale(0, BigDecimal.ROUND_DOWN));

        }
    }
}