import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        boolean judge = s.equals("ABC");
        String result = judge ? "ARC" : "ABC";

        // 出力
        System.out.println(result);
    }
}
