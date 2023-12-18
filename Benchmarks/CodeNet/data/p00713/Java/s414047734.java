import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static double[] x, y;
    static int ans;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        while (true) {
            n = fs.nextInt();
            if (n == 0){
                break;
            }

            x = new double[n];
            y = new double[n];
            for(int i = 0;i < n;i++){
                x[i] = fs.nextDouble();
                y[i] = fs.nextDouble();
            }

            ans = 1;
            // 2点選ぶ全探索
            for(int i = 0;i < n;i++){
                for(int j = i+1;j<n;j++){
                    // そもそも2以上離れているなら無視
                    double dist = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    if(dist > 2){
                        continue;
                    }

                    double mx = (x[i] + x[j]) / 2;
                    double my = (y[i] + y[j]) / 2;
                    double m_dist = Math.sqrt(1 - (dist / 2) * (dist / 2));

                    int temp = 0;
                    double c1x = mx + (y[i] - y[j]) / dist * m_dist;
                    double c1y = my - (x[i] - x[j]) / dist * m_dist;
                    for(int k = 0;k < n;k++){
                        if(Math.pow(x[k] - c1x, 2) + Math.pow(y[k] - c1y, 2) < 1 + 1e-10){
                            temp += 1;
                        }
                    }
                    ans = Math.max(ans, temp);

                    temp = 0;
                    double c2x = mx - (y[i] - y[j]) / dist * m_dist;
                    double c2y = my + (x[i] - x[j]) / dist * m_dist;
                    for(int k = 0;k < n;k++){
                        if(Math.pow(x[k] - c2x, 2) + Math.pow(y[k] - c2y, 2) < 1 + 1e-10){
                            temp += 1;
                        }
                    }
                    ans = Math.max(ans, temp);
                }
            }

            pw.println(ans);
        }
        pw.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
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

        String readNextLine() {
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

