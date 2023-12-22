import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        sc.close();

        // 主処理
        char[] co = o.toCharArray();
        char[] ce = e.toCharArray();
        String result = "";
        for (int i = 0; i < co.length; i++) {
            result += co[i];
            if (i < ce.length) {
                result += ce[i];
            }
        }

        // 出力
        System.out.println(result);
    }
}
