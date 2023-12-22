import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            ans = Math.min(ans, h[i + k - 1] - h[i]);
        }
        System.out.println(ans);
    }
}