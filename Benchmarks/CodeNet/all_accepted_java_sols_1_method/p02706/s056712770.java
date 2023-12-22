import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        int M = s.nextInt();
        long[] a = new long[M];
        for (int i = 0; i < M; i++) {
            a[i] = s.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        if(N >= sum) {
            System.out.println(N-sum);
        } else {
            System.out.println("-1");
        }
        // double ans = 2 * 3.14159 * q;
        // System.out.println(ans);
    }
}