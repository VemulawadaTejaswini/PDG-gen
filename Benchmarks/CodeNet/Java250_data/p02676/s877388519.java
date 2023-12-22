import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int k;
    String s;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        s = sc.next();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if (s.length() <= k) {
            System.out.println(s);            
        } else {
            System.out.println(s.substring(0, k)+"...");            
        }
    }
}