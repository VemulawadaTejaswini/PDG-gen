import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n + 1];
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
            s[i + 1] = sum;
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0 ; i < n ; i++) {
            long b = s[i + 1];
            long c = s[n] - s[i + 1];
            ans = Math.min(ans, Math.abs(c - b));
        }

        System.out.println(ans);

    }

}