import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(new File(args[0]));
        //PrintWriter out = new PrintWriter(new File(args[1]));
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        while (n != 0 && m != 0) {
            int[] max = new int[m];
            for (int i = 0; i < n; i++) {
                int d = in.nextInt() - 1;
                max[d] = Math.max(max[d], in.nextInt());
            }
            long ans = 0;
            for (int i = 0; i < m; i++) {
                ans += max[i];
            }
            out.println(ans);
            n = in.nextInt();
            m = in.nextInt();
        }


        out.close();
    }

    private static class Task {
        int d, p;

        public Task(int d, int p) {
            this.d = d;
            this.p = p;
        }
    }
}

