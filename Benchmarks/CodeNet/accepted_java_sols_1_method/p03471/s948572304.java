import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int a = -1;
        int b = -1;
        int c = -1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int j2 = n - (i + j);
                int total = 10000 * i + 5000 * j + 1000 * j2;
                if (total == y) {
                    a = i;
                    b = j;
                    c = j2;
                    break;
                }
            }
        }
        String result = a + " " + b + " " + c;

        // 出力
        System.out.println(result);
    }
}
