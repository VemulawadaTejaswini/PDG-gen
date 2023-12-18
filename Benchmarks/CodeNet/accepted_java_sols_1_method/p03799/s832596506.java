import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long count = 0;
        if (m / 2 <= n) {
            count = m / 2;
        } else {
            long remainC = m - (n * 2);
            count = remainC / 4 + n;
        }
        long result = count;

        // 出力
        System.out.println(result);
    }
}
