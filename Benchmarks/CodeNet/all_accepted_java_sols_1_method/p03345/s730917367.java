import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        int result;
        if (k % 2 == 0) {
            result = a - b;
        } else {
            result = b - a;
        }

        // 出力
        System.out.println(result);
    }
}
