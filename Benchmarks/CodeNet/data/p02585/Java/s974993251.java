import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static FastIO io = new FastIO("in.txt");

    static int N, K;
    static long[] P, C;

    static long move(int u){
        boolean[] vis = new boolean[N+1];
        long ans = 0;
        long mxans = Long.MIN_VALUE;
        ArrayList<Integer> vs = new ArrayList<>();
        for(int k=1; k<=K; k++){
            int nu = (int)P[u];
            if(vis[nu]){
                int idx = vs.indexOf(nu);
                long l = vs.size() - idx;
                long sum = 0;
                for(int i=idx; i<vs.size(); i++){
                    int p = vs.get(i);
                    sum += C[p];
                }
                long left = K - k + 1;

                if((left / l) >= 1){
                    long anstmp = ans;
                    for(int i=idx; i<vs.size(); i++){
                        int p = vs.get(i);
                        anstmp += C[p];
                        mxans = Math.max(anstmp, mxans);
                    }
                }

                ans += (left / l) * sum;
                mxans = Math.max(ans, mxans);
                for(int i=idx; i<idx + (left % l); i++){
                    int p = vs.get(i);
                    ans += C[p];
                    mxans = Math.max(ans, mxans);
                }
                break;

            }else{
                ans += C[nu];
                u = nu;
                vs.add(nu);
                vis[nu] = true;
            }

            mxans = Math.max(mxans, ans);
        }
        return Math.max(mxans, ans);
    }

    public static void main(String[] args) throws Exception {
        N = io.nextInt(); K = io.nextInt();
        P = new long[N+1]; C = new long[N+1];
        long ans = Long.MIN_VALUE;
        for(int i=1; i<=N; i++){
            P[i] = io.nextLong();
        }
        for(int i=1; i<=N; i++){
            C[i] = io.nextLong();
            ans = Math.max(ans, C[i]);
        }


        for(int u=1; u<=N; u++){
            ans = Math.max(ans, move(u));
        }

        io.println(ans);

        io.flush();
    }

    static class FastIO {
        static StringBuilder sb = new StringBuilder();
        static BufferedReader br;
        static StringTokenizer st;
        static PrintStream ps = new PrintStream(System.out);

        public FastIO(String fname) {
            try {
                File input = new File(fname);
                if (input.exists()) {
                    System.setIn(new FileInputStream(fname));
                }
            }catch (Exception e){
                e.printStackTrace();
            }

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

        void flush(){
            System.out.print(sb.toString());
            sb.setLength(0);
        }

        void print(Object o){
            sb.append(o);
        }

        void println(Object o){
            sb.append(o);
            sb.append('\n');
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
