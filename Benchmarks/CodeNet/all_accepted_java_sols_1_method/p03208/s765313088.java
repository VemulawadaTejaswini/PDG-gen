import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);

        long min = Math.abs(h[0] - h[k-1]);
        for (int i = 0; i <= n - k; i++) {
            long tmp = Math.abs(h[i] - h[i+k-1]);
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}