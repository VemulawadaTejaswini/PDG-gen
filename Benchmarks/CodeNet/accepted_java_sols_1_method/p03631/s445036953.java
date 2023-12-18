import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        // 主処理
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        boolean judge = n.equals(sb.toString());
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
