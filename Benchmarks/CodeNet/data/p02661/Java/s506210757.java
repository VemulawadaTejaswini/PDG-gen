
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    int n;
    int[] as, bs;

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        n = sc.nextInt();
        as = new int[n];
        bs = new int[n];

        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
            bs[i] = sc.nextInt();
        }

        out.println(solve());
        out.flush();
    }

    int solve() {

        int ans = upper(-1, (int)1e9 + 1) - lower(-1, (int)1e9 + 1) + 1;
        if (n % 2 == 0 && ans % 2 == 0) ans--;

        return ans;

    }

    int lower(int l, int r) {
        int center = (n + 1) / 2;
        int c;

        while (l + 1 < r) {
            c = (l + r) / 2;

            if (countMin(c)) {
                r = c;
            } else {
                l = c;
            }
        }

        debug("lo", r);

        return r;
    }

    int upper(int l, int r) {
        int c;

        while (l + 1 < r) {
            c = (l + r) / 2;
            if (countMax(c)) {
                l = c;
            } else {
                r = c;
            }
        }

        debug("up", l);

        return l;
    }

    boolean countMin(int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] <= x) {
                cnt++;
            }
        }
        return cnt >= (n + 1) / 2;
    }

    boolean countMax(int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (x <= bs[i]) {
                cnt++;
            }
        }
        return cnt >= (n + 1) / 2;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}