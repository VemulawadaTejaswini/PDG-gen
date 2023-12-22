import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n < k){
            long ans = n;
            if(ans > k-n)ans = k-n;
            System.out.println(ans);
            return;
        }
        long ans = n%k;
        if(ans==0){
            System.out.println(ans);
            return;
        }
        if(ans > k%ans)ans = k%ans;
        System.out.println(ans);


    }    
    
}





