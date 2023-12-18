import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long ans = 0;

        if (k == 0) {
            System.out.println(n * n);
            sc.close();
            return;
        }

        for (long b = 1; b <= n; b++) {
            long p = n / b;
            long r = n - p * b;
//            long r = n % b;
            ans += p * Math.max(0, b - k);
            ans += Math.max(0, r - k + 1);
        }

        System.out.println(ans);
        sc.close();
    }

}
