import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }

        long minTime = Long.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            minTime = Math.min(minTime, Math.abs(x[i]) + x[i + k - 1] - x[i]);
        }

        for (int i = n - 1; i >= k - 1; i--) {
            minTime = Math.min(minTime, Math.abs(x[i]) + x[i] - x[i - (k - 1)]);
        }

        System.out.println(minTime);

    }
}
