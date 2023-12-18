import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String bstr = sc.next();
        BigDecimal b = new BigDecimal(bstr);
        BigDecimal result = new BigDecimal(a).multiply(b);
        result = result.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println(result.toPlainString());
    }
}