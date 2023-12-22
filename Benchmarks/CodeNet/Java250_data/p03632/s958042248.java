import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int start = Math.max(a, c);
        int end = Math.min(b, d);
        int result = Math.max(0, end - start);

        // 出力
        System.out.println(result);
    }
}
