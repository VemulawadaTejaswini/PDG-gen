import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int remain = a - b;
        String result;
        if (0 <= remain) {
            result = "delicious";
        } else if (0 <= remain + x) {
            result = "safe";
        } else {
            result = "dangerous";
        }

        // 出力
        System.out.println(result);
    }
}
