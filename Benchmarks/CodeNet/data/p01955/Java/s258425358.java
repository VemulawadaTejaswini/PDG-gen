
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2855 Permutation Period
 *    2018/02/20
 */
public class Main {

    long gcm(long a, long b) {

        while(b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    int[] S;

    boolean xon;
    // ループ数を返す
    int loop(int j, int x) {
        xon = false;
        int pj = S[j];
        int k;
        for(k = 1;; k++) {
            if (pj == j)
                break;
            if (pj == x)
                xon = true;
            pj = S[pj];
        }
        return k;
    }
    
    int change;
    int loop2(int x, int y, int[] lcnt) {
        int p = S[x];
        //int k;
        //int p = x;
        int xc;
        int yc = 0;
        for(xc = 1;; xc++) {
            if (p == x)
                break;
            if (p == y)
                yc = xc;
            p = S[p];
        }
        if (yc != 0) {
            if (--lcnt[xc] == 0) change = 1;
            if (++lcnt[yc] == 1) change = 1;
            if (++lcnt[xc - yc] == 1) change = 1;
        }
        else {
            p = S[y];
            //p = y;
            for(yc = 1;; yc++) {
                if (p == y)
                    break;
                p = S[p];
            }
            if (--lcnt[xc] == 0) change = 1;
            if (--lcnt[yc] == 0) change = 1;
            if (++lcnt[xc + yc] == 1) change = 1;
        }
        return 0;
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] x = new int[Q];
        int[] y = new int[Q];
        for(int i = 0; i < Q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            //log.printf("%d %d\n", x[i], y[i]);
        }

        S = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            S[i] = i;
        }

        // cnt別loop数
        int[] lcnt = new int[N + 1];
        lcnt[1] = N;

        long[] pp = new long[100];
        long p = 1;
        for(int q = 0; q < Q; q++) {
//            if (q>10)
//                break;
            loop2(x[q], y[q], lcnt);
//            int change = 1;
//            int l1 = loop(x[q],y[q]);
//            int change = 0;
//            
//            if (--lcnt[l1] == 0)
//                change = 1;
//            if (!xon) {
//                int l2 = loop(y[q],0);
//                if (--lcnt[l2] == 0)
//                    change = 1;
//            }
            int t = S[x[q]];
            S[x[q]] = S[y[q]];
            S[y[q]] = t;
//            int l3 = loop(x[q],y[q]);
//            if (++lcnt[l3] == 1)
//                change = 1;
//            if (!xon) {
//                int l4 = loop(y[q],0);
//                if (++lcnt[l4] == 1)
//                    change = 1;
//            }
            
//            log.printf("%s\n", Arrays.toString(S));
//            log.printf(" %s\n", Arrays.toString(lcnt));
            
            if (change != 0) {
                int ppnum = 1;
                pp[0] = 1;
                for(int m = 1; m <= N; m++) {
                    if (lcnt[m] > 0) {
                        int mm = m;
                        for(int j = 0; j < ppnum; j++) {
                            mm /= gcm(mm, pp[j]);
                        }
                        pp[ppnum - 1] *= mm;
                        if (pp[ppnum - 1] > 100000) {
                            pp[ppnum++] = 1;
                        }
                    }
                }
                p = 1;
                for(int j = 0; j < ppnum; j++) {
                    p = p * pp[j];
                    p = p % 1000000007;
                }
            }
            result.printf("%d\n", p);
        }

        sc.close();
        return false;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


