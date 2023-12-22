import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long c = in.nextLong();
        long[] x = new long[n+1], v = new long[n+1];
        for(int i = 1; i <= n; i++) {
            x[i] = in.nextLong();
            v[i] = in.nextLong();
        }
        long sum = 0;
        long[] maxa1 = new long[n+1], maxa2 = new long[n+1];
        for(int i = 1; i <= n; i++) {
            sum += v[i];
            maxa1[i] = Math.max(maxa1[i-1], sum - x[i]);
            maxa2[i] = Math.max(maxa2[i-1], sum - x[i] * 2);
        }
        sum = 0;
        long[] maxb1 = new long[n+2], maxb2 = new long[n+2];
        for(int i = n; i > 0; i--) {
            sum += v[i];
            maxb1[i] = Math.max(maxb1[i-1], sum - (c - x[i]));
            maxb2[i] = Math.max(maxb2[i-1], sum - (c - x[i]) * 2);
        }
        long ans = 0;
        for(int i = n+1; i > 0; i--) {
            ans = Math.max(ans, Math.max(maxb2[i] + maxa1[i-1], maxa2[i-1] + maxb1[i]));
        }
        System.out.println(ans);
    }
}