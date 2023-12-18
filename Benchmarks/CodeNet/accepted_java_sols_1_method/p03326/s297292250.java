import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        long ans = 0;
        Long[] w = new Long[n];
        for (int i = 0; i < (1 << 3); i++) {
            int xc = -1, yc = -1, zc = -1;
            if ((i & 0b100) > 0) xc = 1;
            if ((i & 0b010) > 0) yc = 1;
            if ((i & 0b001) > 0) zc = 1;
            for (int j = 0; j < n; j++) {
                w[j] = x[j] * xc + y[j] * yc + z[j] * zc;
            }
            Arrays.sort(w, Collections.reverseOrder());
            long sum = 0;
            for (int j = 0; j < m; j++) sum += w[j];
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}