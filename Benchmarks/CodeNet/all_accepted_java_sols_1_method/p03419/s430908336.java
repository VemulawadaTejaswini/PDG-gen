import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        n -= 2 <= n ? 2 : 0;
        m -= 2 <= m ? 2 : 0;
        long result = n * m;

        // 出力
        System.out.println(result);
    }
}
