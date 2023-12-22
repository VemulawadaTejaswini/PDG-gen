import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }

        long limit = (long) 1e18;
        long res = 1;
        for (int i = 0; i < N; i++) {
            if (res > limit / a[i]) {
                res = -1;
                break;
            }
            res *= a[i];

        }

        for (int i = 0; i < N; i++) {
            if (a[i] == 0) res = 0;
        }

        System.out.println(res);
    }
}
