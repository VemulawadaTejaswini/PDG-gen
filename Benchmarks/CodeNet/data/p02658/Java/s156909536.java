import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a0 = sc.nextLong();
        BigDecimal MAX_LIMIT = new BigDecimal(BigInteger.valueOf(10), -17);
        BigDecimal result = new BigDecimal(a0);
        for (int i=1; i<n; i++) {
            long ai = sc.nextLong();
            result = result.multiply(new BigDecimal(ai));
            if (result.compareTo(MAX_LIMIT) > 0) {
                result = new BigDecimal(-1);
                for (int j=i+1; j<n; j++) {
                    long a = sc.nextLong();
                    if (a == 0) {
                        result = BigDecimal.ZERO;
                    }
                }
                break;
            }
        }
        System.out.println(result.toPlainString());
    }
}