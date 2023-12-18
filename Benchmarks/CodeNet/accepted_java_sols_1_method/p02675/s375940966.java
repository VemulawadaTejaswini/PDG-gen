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
        int n = sc.nextInt();
        n %=10;
        String ans = "hon";
        if(n == 3)ans = "bon";
        if(n == 0||n==1||n==6||n==8)ans="pon";
        System.out.println(ans);
    }
}
