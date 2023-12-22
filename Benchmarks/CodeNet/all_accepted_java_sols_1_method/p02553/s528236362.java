import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] a = new long[4];
        for (int i = 0; i < 4; i++) a[i] = scan.nextLong();
        long ans = Long.MIN_VALUE;
        for (int i = 0; i <= 1; i++) {
            for (int j = 2; j <= 3; j++) {
                long val = a[i] * a[j];
                ans = Math.max(ans, val);
            }
        }
        System.out.println(ans);
    }
}
