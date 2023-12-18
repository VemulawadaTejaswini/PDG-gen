import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public  static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt();
        BigInteger b = new BigInteger("1");
        for(int i=1;i<=n;i++)
        {
            long k = obj.nextLong();
            b =  b.multiply(BigInteger.valueOf(k));
        }
        int k = b.compareTo(new BigInteger("1000000000000000000"));
        System.out.println((k>=1)?"-1":b);
    }
}
