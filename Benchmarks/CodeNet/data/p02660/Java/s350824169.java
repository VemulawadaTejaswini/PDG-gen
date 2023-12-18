import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;

public class Main{
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        long q = 2;
        long e = 1;
        long div;
        int loops = 43;

        if(N == 1){
            System.out.println(0);
            return;
        }

        while(1){
            div = (long) Math.pow(q, i);
            if(N % div == 0){
                N /= div;
                ans++;
                e++;
            }else{
                while(N % q == 0){
                    N /= q;
                }
                q++;
                if(q * q > N){
                    break;
                }
                e = 1;
            }
        }
        if(N != 1){
            ans++;
        }

        System.out.println(ans);
    }
}
