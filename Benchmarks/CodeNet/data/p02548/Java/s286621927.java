import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        final int inf = Integer.MAX_VALUE;
        int n = fs.nextInt();
        // a * b + c = n

        int ans = 0;
        for (int i = 1; i < n; i ++) {
            int c = i;
            int target = n - c;
            int cnt = 0;
            for (int j = 1; j * j <= target; j ++) {
                if (target % j == 0) {
                    if (target / j == j) {
//                        System.out.println(j + " " + target / j + " " + c + " " + n);
                        cnt ++;
                    }
                    else {
                        cnt += 2;
//                        System.out.println(j + " " + target / j + " " + c + " " + n);
                    }
                }
            }

            ans += cnt;


        }
        System.out.println(ans);





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
