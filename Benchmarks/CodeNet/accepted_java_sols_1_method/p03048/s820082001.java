import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i <= n; i += r) {
            for (int j = 0; j <= n - i; j += g) {
                int remain = n - (i + j);
                if (remain % b == 0) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
