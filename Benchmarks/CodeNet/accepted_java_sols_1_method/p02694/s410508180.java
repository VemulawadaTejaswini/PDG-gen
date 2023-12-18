import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal X = in.nextBigDecimal();
        BigDecimal yen = new BigDecimal("100");
        BigDecimal rate = new BigDecimal("1.01");
        int count = 0;
        while (yen.compareTo(X)<0){
            yen = new BigDecimal(yen.multiply(rate).toString().split("\\.")[0]);
            count++;
        }
        System.out.print(count);
    }
}