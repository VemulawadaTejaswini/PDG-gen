import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = sc.nextLongArray(n);
            long[] nexta = new long[n];
            Arrays.fill(nexta, 0);

            for (int l = 0; l < Math.min(k, 20); l++) {
                boolean isBreak = true;
                for (int i = 0; i < n; i++) {
                    if (a[i] != n) {
                        isBreak = false;
                        break;
                    }
                }
                if (isBreak)
                    break;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i < j) {
                            if (a[j] - (j - i) >= 0) {
                                nexta[i]++;
                            }
                        } else {
                            if (a[j] - (i - j) >= 0) {
                                nexta[i]++;
                            }
                        }

                    }
                }
                a = nexta.clone();
                Arrays.fill(nexta, 0);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
