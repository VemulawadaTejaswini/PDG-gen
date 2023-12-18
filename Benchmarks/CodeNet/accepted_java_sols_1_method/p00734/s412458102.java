import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static final int MOD = 1000003;
    private static final int[] STD = {5, 7, 5, 7, 7};

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        outer:
        while (true) {
            int n = in.nextInt(), m = in.nextInt();
            if (n == 0 && m == 0) break;
            int[] a = IntStream.range(0, n).map(x -> in.nextInt()).toArray();
            int[] b = IntStream.range(0, m).map(x -> in.nextInt()).toArray();
            int suma = IntStream.of(a).sum(), sumb = IntStream.of(b).sum();
            int inda = -1, indb = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (suma - 2 * a[i] == sumb - 2 * b[j]) {
                        if (inda == -1 && indb == -1) {
                            inda = i;
                            indb = j;
                        } else if (a[inda] + b[indb] > a[i] + b[j]) {
                            inda = i;
                            indb = j;
                        }
                    }
                }
            }
            if (inda == -1)
                out.println(-1);
            else
                out.println(a[inda] + " " + b[indb]);
        }
        out.flush();
    }
}

