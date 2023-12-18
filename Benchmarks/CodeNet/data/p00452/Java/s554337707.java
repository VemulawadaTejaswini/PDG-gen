import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        while (true) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            if(n==0&&m==0)break;
            long[] p = new long[n + 1];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
            }
            p[n] = 0;
            long[] data = new long[(n + 1) * (n + 1) + 1];
            int c = 0;
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    data[c++] = p[i] + p[j];
                }
            }
            data[c++] = Long.MIN_VALUE;
            Arrays.sort(data);
            int index = 0;
            long ans = 0;
            for (int i = 0; i < c; i++) {
                index = Arrays.binarySearch(data, m - data[i]);
                if (index < 0) index = ~index - 1;
                ans = max(ans, data[i] + data[index]);
            }
            out.println(ans);
        }
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }
    }
}
