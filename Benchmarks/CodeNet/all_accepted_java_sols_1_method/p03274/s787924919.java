import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            ans = Math.min(ans, Math.abs(x[i]) + Math.abs(x[i + k - 1] - x[i]));
            ans = Math.min(ans, Math.abs(x[i + k - 1]) + Math.abs(x[i + k - 1] - x[i]));
        }
        System.out.println(ans);
    }
}