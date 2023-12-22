import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] acc = new long[n];
        for(int i = 0; i < n; ++i) acc[i] = (i == 0) ? sc.nextLong() : acc[i - 1] + sc.nextLong();
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < n - 1; ++i) {
            long left = acc[i];
            long right = acc[n - 1] - acc[i];
            ans = Math.min(ans, Math.abs(left - right));
        }
        System.out.println(ans);
    }
}
