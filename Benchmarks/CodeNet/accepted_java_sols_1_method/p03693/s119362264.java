import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int num = r * 100 + g * 10 + b;
        boolean judge = num % 4 == 0;
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
