import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();

        if(k % 2 == 0){
            System.out.println(-1);
            return;
        }

        StringBuilder seven = new StringBuilder("7");
        BigDecimal bd = new BigDecimal(seven.toString());
        BigDecimal zero = new BigDecimal(0);
        BigDecimal kbd = new BigDecimal(k);
        long ans = 1;
        while(!bd.remainder(kbd).equals(zero)){
            seven.append('7');
            bd = new BigDecimal(seven.toString());
            ans++;
        }

        System.out.println(ans);

    }
}
