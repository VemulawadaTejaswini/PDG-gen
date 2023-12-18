import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0653
 *  2020/5/5
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int[] masu = new int[2019 + 1];
        int N = sc.nextInt();
        int[] X = new int[N + 1];
        for(int n = 1; n <= N; n++) {
            X[n] = sc.nextInt();
            masu[X[n]] = 1;
        }
        int M = sc.nextInt();
        for(int m = 0; m < M; m++) {
            int A = sc.nextInt();
            if (X[A] < 2019 && masu[X[A] + 1] == 0) {
                masu[X[A]]--;
                X[A]++;
                masu[X[A]]++;
            }
        }

        for(int n = 1; n <= N; n++) {
            result.printf("%d\n", X[n]);
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


