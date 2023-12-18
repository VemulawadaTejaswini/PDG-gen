import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long ans = 0;
        if(x < 0) {
            x = -x;
        }
        ans = x % d;
        if((k - x/d) < 0) {
            ans = x - d*k;
        }else if((k - x / d) % 2 == 1) {
            ans -= d;
        }
        
        if(ans < 0) ans = -ans;  
        System.out.println(ans);  
    }
}