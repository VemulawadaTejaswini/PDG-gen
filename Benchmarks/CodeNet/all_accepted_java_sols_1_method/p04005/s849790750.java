import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        if (a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
            long ab = a * b;
            long bc = b * c;
            long ac = a * c;
            result = Math.min(Math.min(ab, bc), ac);
        }

        // 出力
        System.out.println(result);
    }
}
