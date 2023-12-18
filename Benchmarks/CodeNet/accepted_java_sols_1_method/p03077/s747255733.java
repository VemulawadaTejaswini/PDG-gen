import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long[] a = new long[5];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLong();
            min = Math.min(min, a[i]);
        }

        long bottleNeck = (long) Math.ceil((double) N / min);
        out.println(bottleNeck + 4);
    }
}