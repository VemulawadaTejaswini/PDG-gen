import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        // 6, 5, 6, 5 ...のときが最小の操作回数
        long cnt = (long) (N / 11) * 2;

        long rest = N % 11;
        if (rest > 0) {
            if (rest <= 6) {
                cnt += 1;
            } else {
                cnt += 2;
            }
        }

        out.println(cnt);
    }
}