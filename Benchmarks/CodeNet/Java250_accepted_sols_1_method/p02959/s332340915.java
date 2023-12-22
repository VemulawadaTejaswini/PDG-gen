import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];
        for (int i = 0; i < N + 1; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }

        long r = 0, d = 0;
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B[i];

            d = Math.min(a, d);

            r += d;
            a -= d;

            r += Math.min(a, b);
            d = Math.max(0, b - a);
        }
        r += Math.min(A[N], d);

        out.println(r);
    }
}
