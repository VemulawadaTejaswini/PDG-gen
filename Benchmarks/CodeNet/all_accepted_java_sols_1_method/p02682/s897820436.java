import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if(k < a){
            System.out.println(k);
            return;
        }
        ans = a;
        k-=a;
        k-=b;
        if(k<=0){
            System.out.println(ans);
            return;
        }
        ans -= k;
        System.out.println(ans);
    }
    
}
