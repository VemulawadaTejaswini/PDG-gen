import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal result = BigDecimal.valueOf(1);

        for (int i=0;i<n;i++){
            String input = sc.next();
            BigDecimal b = new BigDecimal(input);
            if (input == "0") { result = BigDecimal.valueOf(0); break;}
            if (result.longValue() <= 1000000000000000000L && result.longValue() != -1) {
                result = result.multiply(b);
            }

            if (result.longValue() > 1000000000000000000L) {
                result = BigDecimal.valueOf(-1);
            }
        }

        System.out.println(result);
    }
}