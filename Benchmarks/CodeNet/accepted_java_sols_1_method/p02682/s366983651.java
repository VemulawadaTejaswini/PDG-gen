import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());   
        long k = Long.parseLong(sc.next());
        long count = 0;
        if(a <= k) {
            count += a;
            k -= a;
            if(b <= k) {
                k -= b;
                if(c <= k) {
                    count -= c;
                    k -=c;
                }else {
                    count -= k;
                    k = 0;
                }
            }else {
                k = 0;
            }
        }else {
            count = k;
            k = 0;
        }
        System.out.println(count);
    }
}