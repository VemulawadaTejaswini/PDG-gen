import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int minX = 1000, maxX = 0;
        for(int i = 0; i < n; ++i) {
            x[i] = Integer.parseInt(sc.next());
            minX = Math.min(minX, x[i]);
            maxX = Math.max(maxX, x[i]);
        }

        long ans = Long.MAX_VALUE;
        for(int d = minX; d <= maxX; ++d) {
            long costSum = 0L;
            for(int i = 0; i < n; ++i) {
                costSum += (x[i] - d) * (x[i] - d);
            }
            ans = Math.min(ans, costSum);
        }
        System.out.println(ans);
    }
}