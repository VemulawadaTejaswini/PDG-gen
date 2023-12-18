import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.Map;
// import java.util.HashMap;

import java.math.*;

public class Main {
    private static Scanner sc;
    private static final long mod = 1000000007;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private static String getUpperAlpha(int i) {
        return String.valueOf((char) (i + 64));
    }

    /* i=1 return a */
    private static String getLowerAlpha(int i) {
        return String.valueOf((char) (i + 96));
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long[] nextLongArray(int n) throws NumberFormatException, IOException {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        public int[] nextIntArray(int n) throws NumberFormatException, IOException {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }
    }

    private void solve() {
        try {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int m = sc.nextInt();
            int h[] = new int[m];
            int w[] = new int[m];

            int hmaxIdx = 0;
            int hmax = 0;
            int wmaxIdx = 0;
            int wmax = 0;

            Map<Integer, List<Integer>> hmap = new HashMap<>();
            Map<Integer, List<Integer>> wmap = new HashMap<>();
            // Map<Integer, List<Integer>> wmap = new HashMap<>();
            for (int i = 0; i < m; i++) {
                h[i] = sc.nextInt();
                w[i] = sc.nextInt();
                if (hmap.containsKey(h[i])) {
                    List<Integer> list = hmap.get(h[i]);
                    list.add(w[i]);
                    if (list.size() > hmax) {
                        hmaxIdx = h[i];
                        hmax = list.size();
                    }
                    hmap.put(h[i], list);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(w[i]);
                    if (list.size() > hmax) {
                        hmaxIdx = h[i];
                        hmax = list.size();
                    }
                    hmap.put(h[i], list);
                }

                if (wmap.containsKey(w[i])) {
                    List<Integer> list = wmap.get(w[i]);
                    list.add(h[i]);
                    if (list.size() > wmax) {
                        wmaxIdx = w[i];
                        wmax = list.size();
                    }
                    wmap.put(w[i], list);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(h[i]);
                    if (list.size() > wmax) {
                        wmaxIdx = w[i];
                        wmax = list.size();
                    }
                    wmap.put(w[i], list);
                }
            }
            if (hmap.get(hmaxIdx).contains(wmaxIdx)) {
                System.out.println(hmax + wmax - 1);
            } else {
                System.out.println(hmax + wmax);
            }

        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
