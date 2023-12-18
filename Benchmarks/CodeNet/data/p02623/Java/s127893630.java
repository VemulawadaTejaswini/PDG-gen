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
            int ovA = -1;
            int ovB = -1;
            for (int i = 1; i < n; i++) {
                if (sumA[i - 1] <= 1000000000 && sumA[i - 1] <= k) {
                    sumA[i] = a[i] + sumA[i - 1];
                } else {
                    ovA = i - 1;
                    break;
                }
            }
            for (int i = 1; i < m; i++) {
                if (sumB[i - 1] <= 1000000000 && sumB[i - 1] <= k) {
                    sumB[i] = b[i] + sumB[i - 1];
                } else {
                    ovB = Math.max(i - 1, 0);
                    break;
                }
            }
            if (sumB[m - 1] > 1000000000 || sumB[m - 1] > k) {
                ovB = Math.max(m - 1, 0);
            }
            if (sumA[n - 1] > 1000000000 || sumA[n - 1] > k) {
                ovA = Math.max(n - 1, 0);
            }

            if (ovA == -1 && ovB == -1) {
                if (sumA[n - 1] + sumB[m - 1] <= k) {
                    System.out.println(n + m);
                    return;
                }
                int max = 0;

                max = Math.max(m, n);

                int j = -1;
                for (int i = n - 1; i >= -1; i--) {
                    while (j != m) {
                        if (i == -1) {
                            if (sumB[j] <= k && i + j + 2 > max) {
                                max = i + j + 2;
                                j++;
                            } else {
                                break;
                            }
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

            } else {
                int max = 0;
                if (ovA == -1) {
                    max = Math.max(max, n);
                    ovA = n;
                }
                if (ovB == -1) {
                    max = Math.max(max, m);
                    ovB = m;
                }
                int j = -1;
                for (int i = ovA - 1; i >= 0; i--) {
                    while (j != ovB) {
                        if (i == -1) {
                            if (sumB[j] <= k && i + j + 2 > max) {
                                max = i + j + 2;
                                j++;
                            } else {
                                break;
                            }

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
            }

        } catch (

        Exception e) {
            e.printStackTrace();
        }

    }

}
