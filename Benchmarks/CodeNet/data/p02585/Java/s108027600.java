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
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] p = sc.nextIntArray(n);
            long[] c = sc.nextLongArray(n);
            long ans = 0;
            long tk = k;
            long max = Long.MIN_VALUE;
            Set<Integer> aset = new HashSet<>();

            if (k > n) {
                int loop = 0;
                for (int i = 0; i < n; i++) {
                    Set<Integer> set = new HashSet<>();
                    long sum = 0;
                    int idx = i;
                    int iniIdx = i;
                    int loopcount = 0;
                    for (int j = 0; j < k; j++) {
                        set.add(idx);
                        sum += c[idx];
                        idx = p[idx] - 1;
                        if (iniIdx == idx) {
                            if (sum > 0) {
                                loopcount++;
                                long anss = 0;
                                if (k % loopcount == 0) {
                                    anss = sum * (k / loopcount - 1);

                                } else {
                                    anss = sum * (k / loopcount);
                                }
                                if (anss > max) {
                                    // System.out.println(anss);
                                    max = anss;
                                    loop = loopcount;
                                    if (k % loop == 0) {
                                        tk = loop;
                                    } else {
                                        tk = k % loop;
                                    }
                                    aset = set;
                                }
                            }
                            break;
                        }
                        loopcount++;
                    }
                }
            }
            ans = Math.max(max, 0);
            k = tk;
            if (k > n) {
                if (k % n == 0) {
                    k = n;
                } else {
                    k = k % n;
                }
            }
            max = Long.MIN_VALUE;
            if (ans == 0) {
                for (int i = 0; i < n; i++) {
                    Thread.sleep(1000);
                    long sum = 0;
                    int idx = i;

                    for (int j = 0; j < k; j++) {
                        sum += c[idx];
                        idx = p[idx] - 1;
                        max = Math.max(max, sum);
                    }
                }
            } else {
                for (Integer i : aset) {
                    long sum = 0;
                    int idx = i;

                    for (int j = 0; j < k; j++) {
                        sum += c[idx];
                        idx = p[idx] - 1;
                        max = Math.max(max, sum);
                    }
                }
            }
            // if (k > n) {
            // long sum = 0;
            // for (int i = 0; i < n; i++) {
            // sum += c[i];
            // }
            // if (sum > 0) {
            // ans = sum * (k / n);
            // }
            // k %= n;
            // }
            // System.out.println(ans);

            System.out.println(max + ans);
        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
