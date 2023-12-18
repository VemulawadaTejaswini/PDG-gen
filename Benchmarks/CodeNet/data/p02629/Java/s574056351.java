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
        long n = sc.nextLong()-1;
        
        String ans = String.valueOf((char)('a'+n%26));

        while(true){
            n/=26;
            if(n==0)break;
            n--;
            char ansc = (char)('a'+n%26);
            ans = ansc + ans;
            //System.out.println(ans);
            if(n==0)break;
        }
        System.out.println(ans);
    }
}


