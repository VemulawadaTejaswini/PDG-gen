import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = n;
        if (n % k == 0) {
            result = 0;
        } else {
            while (result != 0) {
                long diff = Math.abs(result - k);
                if (k < diff) {
                    diff = diff % k;
                }
                if (result <= diff) {
                    break;
                }
                result = diff;
            }
        }

        // 出力
        System.out.println(result);
    }
}
