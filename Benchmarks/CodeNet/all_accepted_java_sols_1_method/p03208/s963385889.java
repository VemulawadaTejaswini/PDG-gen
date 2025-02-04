import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int min = h[i];
            int max = h[i + k - 1];
            int sa = max - min;
            if (ans > sa) {
                ans = sa;
            }
        }
        System.out.println(ans);
    }
}