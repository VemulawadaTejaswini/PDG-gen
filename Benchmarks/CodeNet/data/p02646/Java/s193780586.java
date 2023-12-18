import java.util.*;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        BigDecimal t = sc.nextBigDecimal();

        BigDecimal diff = BigDecimal.valueOf(Math.abs(b-a));
        BigDecimal c = BigDecimal.valueOf(v-w);

        diff = diff.subtract(c.multiply(t));
        if(diff.compareTo(BigDecimal.valueOf(0))<=0) {
            System.out.print("YES");
            return;
        }

        System.out.print("NO");
    }
}