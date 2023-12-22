import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.next());
        BigDecimal bd = null;
        while(true) {
            bd = new BigDecimal(n);
            Double res = Math.sqrt(bd.doubleValue()); 
            if (new BigDecimal(res).multiply(new BigDecimal(res)).compareTo(bd) == 0) {
                System.out.println(n);
                return;
            }
            n--;
            continue;
        }
    }
}
