import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long INF = (long)Math.pow(10, 18);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();
        long[] s = new long[A + 2];
        s[0] = -INF;
        s[s.length - 1] = INF;
        for (int i = 1; i < s.length - 1; i++) {
            s[i] = sc.nextLong();
        }
        long[] t = new long[B + 2];
        t[0] = -INF;
        t[t.length - 1] = INF;
        for (int i = 1; i < t.length - 1; i++) {
            t[i] = sc.nextLong();
        }
        long[] x = new long[Q];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextLong();
        }
        for (int i = 0; i < x.length; i++) {
            int b = -Arrays.binarySearch(s, x[i]) - 1;
            int d = -Arrays.binarySearch(t, x[i]) - 1;
            long res = INF;
            for (int j = b - 1; j <= b; j++) {
                for (int j2 = d - 1; j2 <= d; j2++) {
                    long l1 = Math.abs(s[j] - t[j2]) + Math.abs(t[j2] - x[i]);
                    long l2 = Math.abs(s[j] - t[j2]) + Math.abs(s[j] - x[i]);
                    res = Math.min(res, Math.min(l1, l2));
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}