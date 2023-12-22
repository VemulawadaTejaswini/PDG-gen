import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // 主処理
        String result = "123".replace(a, "").replace(b, "");

        // 出力
        System.out.println(result);
        sc.close();
    }
}