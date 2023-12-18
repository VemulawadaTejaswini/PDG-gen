import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        sc.close();

        // 主処理
        StringBuilder sb = new StringBuilder(c2);
        sb.reverse();
        boolean judge = c1.equals(sb.toString());
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
