import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        if(
            n%10 == 2 ||
            n%10 == 4 ||
            n%10 == 5 ||
            n%10 == 7 ||
            n%10 == 9        
        ) {
            System.out.println("hon");
        }
        if(
            n%10 == 0 ||
            n%10 == 1 ||
            n%10 == 6 ||
            n%10 == 8        
        ) {
            System.out.println("pon");
        }
        if(
            n%10 == 3        
        ) {
            System.out.println("bon");
        }
    }
}