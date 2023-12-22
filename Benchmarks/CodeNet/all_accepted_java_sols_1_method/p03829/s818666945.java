import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] x = new long[n + 1];

        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        sc.close();

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.min((x[i + 1] - x[i]) * a, b);
        }

        System.out.println(ans);

    }
}