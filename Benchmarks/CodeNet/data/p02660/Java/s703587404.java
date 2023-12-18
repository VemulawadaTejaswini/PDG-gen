import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        int ans = 0;
        int max = 0;
        parent : for (int i = 2; i <= Math.sqrt(x); i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue parent;
                }
            }
            if (x % i == 0) { // 最小の因数を求める
                x /= i;
                max = i;
                ans++;
            }
        }
        if (x > max && x > 1) {
            ans++;
        }

        System.out.println(ans);
    }
}