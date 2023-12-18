import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int c = s.indexOf("C");
        int f = s.lastIndexOf("F");
        boolean judge = 0 <= c && 0 <= f && c < f;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
