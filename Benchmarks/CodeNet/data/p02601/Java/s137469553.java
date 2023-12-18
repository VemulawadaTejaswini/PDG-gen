import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        for (int i = 0; i < k; i++) {
            if (b <= a) {
                b *= 2;
            } else if (c <= b) {
                c *= 2;
            } else {
                break;
            }
        }
        boolean judge = a < b && b < c;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
