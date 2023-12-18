import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCP solver = new CCP();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCP {
        @SuppressWarnings("unchecked")
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long l = in.nextLong();
            long r = in.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();

            int flen = n / 2;
            int slen = n - n / 2;

            ArrayList<Long>[] fir = new ArrayList[flen + 1];
            ArrayList<Long>[] sec = new ArrayList[slen + 1];
            for (int i = 0; i < fir.length; i++) fir[i] = new ArrayList<>();
            for (int i = 0; i < sec.length; i++) sec[i] = new ArrayList<>();
            for (int i = 0; i < 1 << flen; i++) {
                int cnt = 0;
                long sum = 0;
                for (int j = 0; j < flen; j++) {
                    if ((i & (1 << j)) != 0) {
                        cnt++;
                        sum += a[j];
                    }
                }
                fir[cnt].add(sum);
            }
            for (int i = 0; i < 1 << slen; i++) {
                int cnt = 0;
                long sum = 0;
                for (int j = 0; j < slen; j++) {
                    if ((i & (1 << j)) != 0) {
                        cnt++;
                        sum += a[j + flen];
                    }
                }
                sec[cnt].add(sum);
            }
            for (int i = 0; i < flen; i++) fir[i].sort(Comparator.naturalOrder());
            for (int i = 0; i < slen; i++) sec[i].sort(Comparator.naturalOrder());
            // ここまでで選び方の列挙ができた

            // それぞれについて二分探索をかける
            long sum = 0;
            for (int i = 0; i < fir.length; i++) {
                try {
                    for (int j = 0; j < fir[i].size(); j++) {
                        long key = fir[i].get(j);
                        sum += -binarySearch(sec[k - i], l - 1 - key) + binarySearch(sec[k - i], r - key);
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
            out.println(sum);
        }

        int binarySearch(ArrayList<Long> list, long key) {
            int ng = -1;
            int ok = list.size();
            while (Math.abs(ok - ng) > 1) {
                int mid = (ok + ng) / 2;
                if (key < list.get(mid)) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            return ok;
        }

    }
}


