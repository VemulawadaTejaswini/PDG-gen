import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    long a;
    long b;
    long c;
    long k;
    long ans;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        k = sc.nextLong();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if (a < k) {
            ans = a;
            k -= a;                
        } else {
            ans = k;
            k = 0;
        }
        if (b < k && k > 0) {
            k -= b;
        } else {
            k = 0;
        }
        if (k > 0) {
            ans -= k;
        }
        System.out.println(ans);
    }
}