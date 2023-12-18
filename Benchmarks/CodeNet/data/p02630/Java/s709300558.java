import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import java.math.*;

public class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
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
            int n = sc.nextInt();
            int[] a = sc.nextIntArray(n);
            int q = sc.nextInt();
            int[] b = new int[q];
            int[] c = new int[q];
            for (int i = 0; i < q; i++) {
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }

            Map<Integer, Integer> counts = new HashMap<>();
            for (int num : a) {
                Integer count = counts.get(num);
                if (count == null) {
                    counts.put(num, 1);
                } else {
                    counts.put(num, count + 1);
                }
            }
            for (int i = 0; i < q; i++) {

                Integer count = counts.get(b[i]);
                if (count != null) {
                    long diff = (c[i] - b[i]) * count;
                    counts.put(b[i], 0);

                    Integer countc = counts.get(c[i]);
                    if (countc == null) {
                        counts.put(c[i], count);
                    } else {
                        counts.put(c[i], countc + count);
                    }
                    sum += diff;
                }

                System.out.println(sum);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
