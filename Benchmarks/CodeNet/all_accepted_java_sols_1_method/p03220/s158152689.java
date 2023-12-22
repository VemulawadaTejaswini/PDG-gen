import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int ans = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double tmp = (double)t - (double)h[i] * 0.006;
            double diff = Math.abs(a - tmp);
            if (diff < min) {
                ans = i;
                min = diff;
            }
        }

        System.out.println(ans+1);
    }
}