import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
 
        BigDecimal a = new BigDecimal(A);
        BigDecimal b = new BigDecimal(B);
 System.out.println(a.multiply(b).toBigInteger());
    }
}