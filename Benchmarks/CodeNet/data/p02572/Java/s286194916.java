import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        CP sc = new CP();
        int n = sc.nextInt();
        BigInteger[] A = new BigInteger[n];
        BigInteger[] B = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            B[i] = BigInteger.valueOf(x);
            if (i == 0)
                A[i] = BigInteger.valueOf(x);
            else
                A[i] = BigInteger.valueOf(x).add(A[i - 1]);
        }
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            res = res.add(B[i].multiply(A[n - 1].subtract(A[i])));
        }
        System.out.println(res.mod(new BigInteger("1000000007")));
    }

    /*****************************************************************************/
    static class CP {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        public CP() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        int nextInt() {
            return Integer.parseInt(NNNN());
        }

        long nextLong() {
            return Long.parseLong(NNNN());
        }

        double nextDouble() {
            return Double.parseDouble(NNNN());
        }

        String NNNN() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        String nextLine() {
            String spl = "";
            try {
                spl = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return spl;
        }
    }
    /*****************************************************************************/
}