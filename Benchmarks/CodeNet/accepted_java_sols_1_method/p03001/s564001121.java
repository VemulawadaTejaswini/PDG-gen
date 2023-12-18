import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int wide = Integer.parseInt(sc.next());
        int height = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        BigDecimal wi = BigDecimal.valueOf(wide);
        BigDecimal he = BigDecimal.valueOf(height);
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal res = wi.multiply(he);
        res = res.divide(two);
        int i = 0;
        if(wide%2==0&&w*2==wide) {
            if(height%2==0&&h*2==height) {
                i = 1;
            }
        }
        System.out.println(res+" "+i);
    }
}
