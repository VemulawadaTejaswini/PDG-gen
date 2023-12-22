import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();

        if (n == 1) {
            System.out.println(p);
            return;
        }

        long ans = 1;

        for (long i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) { // 最小の因数を求める
                int contain = 0;
                while (p % i == 0) {
                    p /= i; // 最小の因数で割った数を代入する
                    contain++;
                }
                if (contain >= n) {
                    ans *= Math.pow(i, contain / n);
                }
            }
        }
        System.out.println(ans);
    }
}