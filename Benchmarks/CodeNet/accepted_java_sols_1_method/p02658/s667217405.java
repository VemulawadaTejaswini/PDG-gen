import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigDecimal ans = new BigDecimal(1);

        BigDecimal[] a = new BigDecimal[n];
        for(int i = 0; i < n; i++){
            a[i] = new BigDecimal(sc.nextLong());
            if(a[i].equals(new BigDecimal(0))){
                System.out.println(0);
                return;
            }
        }

        for(int i = 0; i < n; i++){
            ans = ans.multiply(a[i]);
            if(ans.compareTo(new BigDecimal(1000000000000000000L)) > 0){
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);

    }
}
