import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        BigDecimal bm = new BigDecimal(line);
        BigDecimal circum = new BigDecimal(bm.toPlainString());
        circum = circum.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI));
        BigDecimal area = bm.multiply(bm).multiply(new BigDecimal(Math.PI));

        System.out.println(circum.toPlainString());
        System.out.println("a");
        System.out.println(area.toPlainString());
    }
}