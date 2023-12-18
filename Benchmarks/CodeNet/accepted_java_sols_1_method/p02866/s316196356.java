import java.util.*;
 
public class Main {

    private static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+10];
        int maxDist = 0;
        boolean valid = true;
        for (int i = 0; i < N; i++) {
            int dist = sc.nextInt();
            if (i == 0 && dist != 0) {
                valid = false;
            }
            num[dist]++;
            maxDist = Math.max(maxDist, dist);
        }
        if (!valid || num[0] != 1) {
            // invalid
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (int i = 1; i <= maxDist; i++) {
            int a = num[i-1];
            int n = num[i];
            // a^n
            while (n-- > 0) {
                ans *= (long)a;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}
