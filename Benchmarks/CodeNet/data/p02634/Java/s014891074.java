import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
    long MOD = 998244353L;
    Map<Integer, Long> cache = new HashMap<>();
    void solve(Scanner sc, PrintWriter pw) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        pw.println(func(A, B, C, D));
    }
 
    private long func(int a, int b, int c, int d) {
        if (c == a && b == d) {
            return 1L;
        }
        int key = (c << 12) + d;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        long ans = 0;
        if (c > a) {
            long part = func(a, b, c - 1, d);
            ans = (part * d);
        }
        if (d > b) {
            long part = func(a, b, c , d - 1);
            ans = (ans + (part * c));
        }
        if (c > a && d > b) {
            ans = (ans - (func(a, b, c - 1, d - 1) * (c - 1) * (d - 1)));
        }
        ans = ((ans %MOD) + MOD) % MOD;
        cache.put(key, ans);
        return ans;
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}