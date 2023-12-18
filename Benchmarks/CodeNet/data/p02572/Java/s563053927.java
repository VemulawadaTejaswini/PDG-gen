import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long MOD = (long) 1e9 + 7;
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] acc = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            acc[i + 1] = acc[i] + arr[i];
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + ((acc[n] - acc[i + 1]) % MOD) * arr[i] % MOD) % MOD;
        }

        System.out.println(ans);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
