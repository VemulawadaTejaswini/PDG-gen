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
            res *= a[i];
        }

        if (res > limit) {
            res = -1;
        }

        System.out.println(res);
    }
}
