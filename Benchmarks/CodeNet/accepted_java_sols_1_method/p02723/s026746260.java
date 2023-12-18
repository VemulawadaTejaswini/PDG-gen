import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String result = s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5) ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
