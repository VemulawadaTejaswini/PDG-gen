
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2837 Cryptex
 *    2018/02/17
 */
public class Main {

    int N;
    int M;
    int[] T;
    int nidx; // 負になる場所

    // 手数の2倍を返す
    int tesu(int[] T) {
        int sum1 = 0;
        int sum2 = 0;
        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i < N; i++) {
            if (T[i] > 0) {
                int t = T[i];
                sum1 += t;
                if (t > max1) {
                    max1 = t;
                }
            }
            else {
                int t = - T[i];
                sum2 += t;
                if (t > max2) {
                    max2 = t;
                }
            }
        }
        int f = 0;
        if ((sum1 % 2 != 0 || sum2 % 2 != 0)) {
            sum1 += 2; // +1手
            f = 1;
        }
        
        if (max1 * 2 - sum1 > 0) {
            sum1 += (max1 * 2 - sum1-f) * 2;
            f = 0;
        }
        if (max2 * 2 - sum2 > 0) {
            sum2 += (max2 * 2 - sum2-f) * 2;
            f = 0;
        }
        return sum1 + sum2;
    }

    int sov() {
        int min = tesu(T);
        if (min % 2 == 0) {
            if (nidx > 0) {
                int old = T[nidx - 1];
                T[nidx - 1] -= M;
                int m = tesu(T);
                T[nidx - 1] = old;
                if (m < min) 
                    min = m;
            }
            if (nidx < N) {
                int old = T[nidx];
                T[nidx] += M;
                int m = tesu(T);
                T[nidx] = old;
                if (m < min) 
                    min = m;
            }
        }
        else {
            if (nidx == 0) {
                T[0] += M;
                T[1] += M;
                T[2] += M;
                min = tesu(T);
            }
            else if (nidx == N) {
                T[N - 1] -= M;
                T[N - 2] -= M;
                T[N - 3] -= M;
                min = tesu(T);
            }
            else {
                min = 99999999;
                if (nidx > 0) {
                    int old = T[nidx - 1];
                    T[nidx - 1] -= M;
                    int m = tesu(T);
                    T[nidx - 1] = old;
                    if (m < min) 
                        min = m;
                }
                if (nidx < N) {
                    int old = T[nidx];
                    T[nidx] += M;
                    int m = tesu(T);
                    T[nidx] = old;
                    if (m < min) 
                        min = m;
                }
            }
        }
        return min / 2;
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        N = sc.nextInt();
        M = sc.nextInt();
        log.printf("%d %d\n",  N, M);

        T = new int[N];
        for(int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int ret = 0;
        if (N == 2 && T[0] != T[1]) {
            ret = -1;
        }
        else {
            Arrays.sort(T);
            nidx = -1;
            for(int i = 0; i < N; i++) {
                if (T[i] > M / 2) {
                    if (nidx < 0)
                        nidx = i;
                    T[i] -= M;
                }
            }
            if (nidx < 0)
                nidx = N;
            int min = tesu(T);
            if (M % 2 == 0 && min % 2 != 0) {
                ret = -1;
            }
            else {
                ret = sov();
            }
        }
        result.printf("%d\n", ret);
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

        int N = Integer.MAX_VALUE;
        //int N = readIntArray()[0];

        for(int i = 0; i < N; i++) {
            boolean b = instance.main();
            if (!b)
                break;
        }

        instance.systemin.close();
    }


}


