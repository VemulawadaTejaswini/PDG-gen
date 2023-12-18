import java.util.*;

public class Main {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] list = new long[n];
        long sum = 0;
        long mod = 1000000007;
        long ans = 0;

        for (int i = 0; i<n; i++) {
            long a = scan.nextLong();
            list[i] = a;
            sum += a;
            sum %= mod;

        }

        for (int i = 0; i<n; i++) {

            sum= sum - list[i];
            if (sum < 0)  {
                sum += mod;
            }

            ans += list[i] * sum;
            ans %= mod;
        }

        System.out.println(ans);

    }
}
