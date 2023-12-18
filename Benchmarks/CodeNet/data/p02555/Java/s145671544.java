import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    Long[] memo;
    final long MOD = (long) (1e9 +7); 
    
    long compute(int n) {
        if(n == 0) {
            return 1;
        }
        if(memo[n] != null) {
            return memo[n];
        }
        long ans = 0;
        for(int i = 3; i <= n; ++i) {
            ans += compute(n - i);
            ans %= MOD;
        }
        return memo[n] = ans;
    }
    
    void solve(Scanner in, PrintWriter out) {
        int s = in.nextInt();
        memo = new Long[s + 1];     
        out.println(compute(s));
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
