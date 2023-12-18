
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static int MOD = 998244353;

    static void solve(InputStream is, PrintStream os) {
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int K = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        int dp[] = new int[N];
        for(int i = 0; i < K; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            for(int j = l; j <= r; j++) {
                list.add(j);
            }
        }

        Collections.sort(list);
        dp[N-1] = 1;
        for(int i = N-2; i >= 0; i--) {
            for(Integer d : list){
                if(i+d < N) {
                    dp[i] += dp[i+d];
                    dp[i] %= MOD;
                } else {
                    break;
                }
            }
        }

        os.println(dp[0]%MOD);
    }
}
