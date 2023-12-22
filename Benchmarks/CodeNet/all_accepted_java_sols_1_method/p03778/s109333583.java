import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int case1 = Math.max(0, b - (a + w));
        int case2 = Math.max(0, a - (b + w));
        int result = Math.max(case1, case2);

        // 出力
        System.out.println(result);
    }
}
