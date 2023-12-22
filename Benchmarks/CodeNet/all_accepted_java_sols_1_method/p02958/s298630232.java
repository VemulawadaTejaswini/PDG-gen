import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = in.nextInt();
        }
        
        int err = 0;
        for (int i = 0; i < N; i++) {
            if (P[i] != i + 1) {
                err++;
            }
        }

        out.println(err == 0 || err == 2 ? "YES" : "NO");
    }
}
