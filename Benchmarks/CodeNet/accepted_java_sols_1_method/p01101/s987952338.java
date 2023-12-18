import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        while (n != 0) {
            long[] a = new long[n];
            long ans = -1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                for (int j = 0; j < i; j++) {
                    if (a[i] + a[j] <= m) {
                        ans = Math.max(a[i] + a[j], ans);
                    }
                }
            }
            if (ans == -1) {
                out.println("NONE");
            } else {
                out.println(ans);
            }

            n = in.nextInt();
            m = in.nextInt();
        }
        out.flush();
    }
}

