import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 1551
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);

    void main() throws IOException {

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] w = new int[N];
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int L = sc.nextInt();

            for(int j = 0; j < L; j++) {
                w[(a + j) % N] = 1;
            }
        }

        int[] t = new int[N + 1];
        int s = 0;
        int f = 0;
        int s0 = 0;
        int i;
        for(i = 0; i < N; i++) {
            if (f == 0 && w[i] == 1) {
                s = i;
                f = 1;
            }
            else if (f == 1 && w[i] == 0) {
                f = 0;
                if (s == 0) {
                    s0 = i;
                }
                else {
                    t[i - s]++;
                }
            }
        }
        if (f == 1) {
            t[i - s + s0]++;
        }
        else if (s0 != 0) {
            t[s0]++;
        }

        for(i = N; i > 0; i--) {
            if (t[i] > 0) {
                result.println(i + " " + t[i]);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


