import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        BigDecimal abi = new BigDecimal(a);
        String b = sc.next();
        BigDecimal bbi = new BigDecimal(b);
        BigDecimal ans = abi.multiply(bbi);
        long pri = ans.longValue();

        System.out.println(pri);
        sc.close();
    }
}