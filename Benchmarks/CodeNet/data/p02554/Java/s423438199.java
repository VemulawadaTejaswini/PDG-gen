import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    Long[][][] memo;
    final long MOD = (long) (1e9 + 7);
    long compute(int n, int z, int o) {
        if(n == 0) {
            if(z == 1 && o == 1){
                return 1;
            }
            return 0;
        }
        if(memo[n][z][o] != null) {
            return memo[n][z][o];
        }
        long ans = 0;
        for(int i = 0; i <= 9; ++i) {
            if(i == 0) {
                ans += compute(n - 1, 1, o);
                ans %= MOD;
            }else if(i == 9) {
                ans += compute(n - 1, z, 1);
                ans %= MOD;
            }else {
                ans += compute(n - 1, z, o);
                ans %= MOD;
            }
        }
        return memo[n][z][o] = ans;
    }
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        memo = new Long[n + 1][2][2];
        out.println(compute(n, 0, 0));
    }

    public static void main(String[] args) {
        new Thread(null, () -> {
            try(Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
                new Main().solve(in, out);
            }
        }, "worker", 1 << 26).start();

    }
}
