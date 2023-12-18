import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long mod = 1000000007;
        long shi = 1L, jiu = 1L, ba = 1L;
        for (int i = 1; i <= n; i++) {
            shi = shi * 10 % mod;
            jiu = jiu * 9 % mod;
            ba = ba * 8 % mod;
        }
        long ans = ((shi - jiu - jiu + ba) % mod + mod) % mod;
        System.out.println(ans);
    }
}
