
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int x = sc.nextInt();
        final int y = sc.nextInt();
        sc.close();
        int kame = x;
        int tsuru = 0;
        String result = "No";
        for (int i = 0; i <= x; i++) {
            if (y == kame * 2 + tsuru * 4) {
                result = "Yes";
                break;
            }
            kame--;
            tsuru++;
        }
        System.out.println(result);
    }
}
