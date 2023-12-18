import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt()*30;
        int m = sc.nextInt()*6;
        double ans = 0.0;
        double c = 0;
        if (h > m){
            c = h-m;
        }else {
            c = m-h;
        }
        if (c!=90){
            c=Math.toRadians(c);
            ans = ((a*a + b*b) - (2*a*b * Math.cos(c)));
            System.out.printf("%.9f", Math.sqrt(ans)+1);

        }else {
            c=Math.toRadians(c);
            ans = ((a*a + b*b) - (2*a*b * Math.cos(c)));
            System.out.printf("%.9f", Math.sqrt(ans));
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