import java.math.BigDecimal;
import java.util.*;

public class Main {

    static BigDecimal MAX = new BigDecimal(1_000_000_000_000_000_000L);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] == 0) hasZero = true;
        }
        if(hasZero){
            System.out.println(0);
        }else{
            BigDecimal d = new BigDecimal(a[0]);
            boolean over = false;
            for (int i = 1; i < n; i++) {
                d = d.multiply(new BigDecimal(a[i]));
                if(d.compareTo(MAX) == 1){
                    over = true;break;
                }
            }
            if(over) System.out.println(-1);
            else System.out.println(d.longValue());
        }
        sc.close();

    }

}
