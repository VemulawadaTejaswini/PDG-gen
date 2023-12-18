import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = scanner.nextInt();
        }
        Arrays.parallelPrefix(w, Integer::sum);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, Math.abs(w[n] - w[i] - w[i]));
        }
        System.out.println(ans);
    }
}