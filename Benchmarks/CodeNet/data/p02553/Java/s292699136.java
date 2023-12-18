import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            BigInteger abcd[] = new BigInteger[4];
            abcd[0] = BigInteger.valueOf(A).multiply(BigInteger.valueOf(C));
            abcd[1] = BigInteger.valueOf(A).multiply(BigInteger.valueOf(D));
            abcd[2] = BigInteger.valueOf(B).multiply(BigInteger.valueOf(C));
            abcd[3] = BigInteger.valueOf(B).multiply(BigInteger.valueOf(D));

            BigInteger max = abcd[0];

            for(int i = 1; i < abcd.length; i++) {
                if(max.compareTo(abcd[i]) == -1) {
                	max = abcd[i];
                }
            }
        	System.out.println(max);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
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
}