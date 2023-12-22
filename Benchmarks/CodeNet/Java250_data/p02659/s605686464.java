import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static String solve(BigDecimal a, BigDecimal b) {
        String result = a.multiply(b).toString();
        int decimalIndex = result.indexOf('.');
        return decimalIndex == -1 ? result : result.substring(0, decimalIndex);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sn.next());
        BigDecimal b = new BigDecimal((sn.next()));
        System.out.println(solve(a,b));
    }
}