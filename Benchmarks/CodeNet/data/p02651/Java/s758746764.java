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
    }

    private void solve() {
        try {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();

                long[] input = new long[n];
                for (int j = 0; j < n; j++) {
                    input[j] = sc.nextLong();
                }
                String s = sc.next();
                if (s.substring(s.length() - 1).equals("1")) {
                    System.out.println(1);
                    continue;
                }
                long[][] AA = new long[n][2];
                for (int j = 0; j < n; j++) {
                    AA[j][0] = (long) s.charAt(j);
                    AA[j][1] = input[j];
                }
                Arrays.sort(AA, (a, b) -> Long.compare(b[0], a[0]));
                for (int j = 0; j < n; j++) {
                    input[j] = AA[j][1];
                }
                int zeroIndex = -1;
                for (int j = 0; j < n; j++) {
                    if (AA[j][0] == 48) {       
                        zeroIndex = j;
                        break;
                    }
                }
                if (xOR(s, input, 0, 0, zeroIndex, n)) {

                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean xOR(String s, long a[], int idx, long result, int zeroindex, int n) {
        if (idx != zeroindex) {
            boolean b1 = xOR(s.substring(Math.min(1, s.length() - 1)), a, idx + 1, result, zeroindex, n);
            if (!b1)
                return false;
            result = result ^ a[idx];
            boolean b2 = xOR(s.substring(Math.min(1, s.length() - 1)), a, idx + 1, result, zeroindex, n);
            if (!b2)
                return false;

        } else {
            boolean b1 = xORzero(s, a, idx, result, n);
            return b1;

        }

        return true;
    }

    private static boolean xORzero(String s, long a[], int idx, long result, int n) {
        if (idx != n) {
            boolean b1 = xORzero(s.substring(Math.min(1, s.length() - 1)), a, idx + 1, result, n);
            if (b1)
                return true;
            result = result ^ a[idx];
            boolean b2 = xORzero(s.substring(Math.min(1, s.length() - 1)), a, idx + 1, result, n);
            if (b2)
                return true;
        } else {
            if (result == 0) {
                return true;
            } else {
                return false;
            }

        }

        return false;
    }

}
