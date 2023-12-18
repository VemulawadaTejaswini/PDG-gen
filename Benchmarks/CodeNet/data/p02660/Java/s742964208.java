import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        int ans = 0;
        ArrayList<Long> list = new ArrayList<>();
        parent : for (int i = 2; i <= Math.sqrt(x); i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue parent;
                }
            }
            if (list.contains((long)i)) {
                continue;
            }
            if (x % i == 0) { // 最小の因数を求める
                int v = i;
                while (x % v == 0) {
                    x /= v;
                    list.add((long)v);
                    v *= i;
                    ans++;
                }

            }
        }
        if (x > 1 && !list.contains(x)) {
            ans++;
        }

        System.out.println(ans);
    }
}