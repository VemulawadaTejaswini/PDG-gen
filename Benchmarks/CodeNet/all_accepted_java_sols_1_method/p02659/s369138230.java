import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        String b = sc.next();
        BigDecimal c = new BigDecimal(b);
        BigDecimal d = new BigDecimal(a);
        System.out.println(c.multiply(d).toBigInteger());
    }
}