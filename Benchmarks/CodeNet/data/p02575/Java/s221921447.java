

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int h = fs.nextInt();
        final int w = fs.nextInt();
        final int[][] banned = new int[h][2];
        for (int i = 0; i < h; i++) {
            banned[i] = new int[] { fs.nextInt(), fs.nextInt() };
        }
        if (banned[0][0] == 1) {
            final List<Long> res = getLongs(h, w, banned, banned[0][1] + 1);
            for (int i = 0; i < h; i++) {
                final long curr = i >= res.size() ? -1 : res.get(i);
                System.out.println(curr);
            }
        } else {
            final List<Long> res1 = getLongs(h, w, banned, 1);
            final List<Long> res2 = getLongs(h, w, banned, banned[0][1] + 1);
            for (int i = 0; i < h; i++) {
                final long curr1 = i >= res1.size() ? -1 : res1.get(i);
                final long curr2 = i >= res2.size() ? -1 : res2.get(i);
                if (curr1 == -1 && curr2 == -1) {
                    System.out.println(-1);
                } else if (curr1 == -1) {
                    System.out.println(curr2);
                } else if (curr2 == -1) {
                    System.out.println(curr1);
                } else {
                    System.out.println(Math.min(curr1, curr2));
                }
            }
        }
    }

    private static List<Long> getLongs(int h, int w, int[][] banned, int y) {

        final List<Long> res = new ArrayList<>();
        long dist = 0;
        for (int i = 0; i < h; i++) {
            if (y >= banned[i][0]) {
                if (banned[i][1] == w) {
                    res.add(-1L);
                    break;
                }
                final long needed = banned[i][1] - y + 1;
                y += needed;
                dist += needed;
            }
            dist++;
            res.add(dist);
        }
        return res;
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
