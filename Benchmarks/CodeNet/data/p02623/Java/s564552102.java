import java.io.*;
import java.util.*;
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
            int m = sc.nextInt();
            long k = sc.nextLong();
            long[] a = sc.nextLongArray(n);
            long[] b = sc.nextLongArray(m);
            long[] sumA = new long[n];
            long[] sumB = new long[m];
            sumA[0] = a[0];
            sumB[0] = b[0];
            for (int i = 1; i < n; i++) {
                sumA[i] = a[i] + sumA[i - 1];
            }
            for (int i = 1; i < m; i++) {
                sumB[i] = b[i] + sumB[i - 1];
            }
            if (sumA[n - 1] + sumB[m - 1] <= k) {
                System.out.println(n + m);
                return;
            }
            int max = 0;
            int j = -1;
            for (int i = n - 1; i >= -1; i--) {
                while (j != m) {
                    if (i == -1 && j == -1) {
                        max = 0;
                        break;
                    } else if (i == -1) {
                        if (sumB[j] <= k) {
                            if (i + j + 2 > max) {
                                max = i + j + 2;
                            }
                        } else {
                            break;
                        }
                        j++;
                    } else if (j == -1) {
                        if (sumA[i] <= k && i + 1 > max) {
                            max = i + 1;
                        } else {
                            if (sumA[i] > k)
                                break;
                        }
                        j++;
                    } else if (sumA[i] + sumB[j] <= k) {
                        if (i + j + 2 > max) {
                            max = i + j + 2;
                        }
                        j++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(max);

        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }

}
