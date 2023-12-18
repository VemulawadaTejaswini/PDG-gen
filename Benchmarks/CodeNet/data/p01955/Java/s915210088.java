
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

        int[] S = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            S[i] = i;
        }        
        
        
        for(int q = 0; q < Q; q++) {
            int t = S[x[q]]; S[x[q]] = S[y[q]]; S[y[q]] = t;
            //log.printf("%s\n", Arrays.toString(S));
            long p = 1;
            for(int j = 1; j <= N; j++) {
                int pj = S[j];
                int k;
                for(k = 1;; k++) {
                    if (pj == j)
                        break;
                    pj = S[pj];
                }
                log.printf("k = %d\n",  k);
                p = p / gcm(p, k) * k;
            }
            //log.printf("p = %d\n", p);
            result.printf("%d\n", p % 1000000007);
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


