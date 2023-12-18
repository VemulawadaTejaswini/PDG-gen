import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            long tmp = h[i + k - 1] - h[i];
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}