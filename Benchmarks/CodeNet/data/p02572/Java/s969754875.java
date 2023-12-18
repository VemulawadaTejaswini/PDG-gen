import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) a[i] = sc.nextLong();

        long MOD = (long)1e9 + 7;

        long res = 0;
        long[] sum = new long[n+1];

        for (int i=1; i<=n; i++) {
            sum[i] = sum[i-1] + a[i-1];
        }

        for (int i=0; i<n; i++) {
            long tmpSum = sum[n-i-1];
            tmpSum = tmpSum % MOD;
            tmpSum *= a[n-i-1];
            res += tmpSum;
            res %= MOD;
        }

        System.out.print(res % MOD);

    }

}

