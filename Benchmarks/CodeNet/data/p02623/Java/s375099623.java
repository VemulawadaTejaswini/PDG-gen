import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] sumsA = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sumsA[i] = sumsA[i - 1] + sc.nextInt();
        }
        long[] sumsB = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            sumsB[i] = sumsB[i - 1] + sc.nextInt();
        }
        int idx = m;
        int max = 0;
        for (int i = 0; i <= n && sumsA[i] <= k; i++) {
            while (sumsA[i] + sumsB[idx] > k) {
                idx--;
            }
            max = Math.max(max, i + idx);
        }
        System.out.println(max);
    }
}