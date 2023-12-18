import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            long left = x[i];
            long right = x[i + k - 1];
            ans = Math.min(Math.abs(left) + right - left, ans);
            ans = Math.min(Math.abs(right) + right - left, ans);
        }
        System.out.println(ans);
    }

}
