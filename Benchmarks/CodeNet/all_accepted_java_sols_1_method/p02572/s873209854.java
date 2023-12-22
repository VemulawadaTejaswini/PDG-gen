import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varN = Integer.parseInt(sc.next());
        int mod = 1000000007;

        long result = 0;
        long p = 0;
        long cur = 0;
        for (int i = 0; i < varN; i++) {
            cur = Long.parseLong(sc.next());
            result = (result + (cur * p) % mod) % mod;
            p = (cur + p) % mod;
        }
        sc.close();
        System.out.println(result);
    }
}
