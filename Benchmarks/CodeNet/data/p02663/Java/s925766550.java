import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int h1,h2,m1,m2,k,total;
        h1=s.nextInt();
        m1=s.nextInt();
        h2=s.nextInt();
        m2=s.nextInt();
        k=s.nextInt();
        if(m2>=m1)
            total=(h2-h1)*60+(m2-m1)-k;
        else
            total=(h2-h1-1)*60+(m2+60-m1)-k;
        System.out.println(total);
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }

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

}