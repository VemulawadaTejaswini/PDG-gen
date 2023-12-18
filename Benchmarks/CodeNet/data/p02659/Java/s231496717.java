import java.math.BigDecimal;
import java.util.*;

public class Main {

    static BigDecimal MAX = new BigDecimal(1_000_000_000_000_000_000L);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        double b=sc.nextDouble();
        a*=(long)Math.ceil(b*100);
        System.out.println(Math.floor(a/100));
        
        sc.close();

    }

}
