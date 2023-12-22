import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = k <= (int) Math.ceil(n / 2.0);
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
