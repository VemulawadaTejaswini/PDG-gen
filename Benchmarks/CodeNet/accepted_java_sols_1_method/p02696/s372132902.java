import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long max = n < b ? Math.min(b, n) : Math.min(b, n) - 1;

        double d = (double) max / b;
        long left = (long) Math.floor(d * a);
        long right = (long) Math.floor(d) * a;
        long num = left - right;

        long result = num;

        // 出力
        System.out.println(result);
    }
}
