import java.util.*;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
}
