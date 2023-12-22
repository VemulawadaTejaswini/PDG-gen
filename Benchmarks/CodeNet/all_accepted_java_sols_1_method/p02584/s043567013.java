import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(Long.parseLong(sc.next()));
        long k = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        long base = d * 2;
        if ((x % d == 0 && k <= x / d) || (x % d != 0 && k <= (x / d + 1))) {
            result = Math.abs(x - k * d);
        } else if (k % 2 == 0) {
            long mlt = (long) Math.ceil((double) x / base);
            long right = base * mlt;
            long left = right - base;
            long plus = Math.min(Math.abs(x + right), Math.abs(x + left));
            long minus = Math.min(Math.abs(x - right), Math.abs(x - left));
            result = Math.min(plus, minus);
        } else if (k == 1) {
            long plus = Math.abs(x + d);
            long minus = Math.abs(x - d);
            result = Math.min(plus, minus);
        } else {
            long mlt = (long) Math.ceil(Math.ceil((double) x / d) / 2.0);
            long right = base * mlt + d;
            long left = right - base;
            long plus = Math.min(Math.abs(x + right), Math.abs(x + left));
            long minus = Math.min(Math.abs(x - right), Math.abs(x - left));
            result = Math.min(plus, minus);
        }

        // 出力
        System.out.println(result);
    }
}
