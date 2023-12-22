import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int q = std.nextInt();
        int[] as = new int[q];
        for (int i = 0; i < q; i++) {
            as[i] = std.nextInt() - 1;
        }

        int[] cp = new int[n];
        for (int i = 0; i < q; i++) {
            int c = as[i];
            cp[c]++;
        }

        int[] dp = new int[n];
        Arrays.fill(dp, k);

        long[] sum = new long[n];
        long all = Arrays.stream(cp).sum();
        for (int i = 0; i < n; i++) {
            sum[i] = all - cp[i];
        }

        for (int i = 0; i < n; i++) {
            if (k > sum[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
