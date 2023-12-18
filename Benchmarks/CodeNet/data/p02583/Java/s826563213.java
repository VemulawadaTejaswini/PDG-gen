import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static FastIO io = new FastIO("in.txt");

    public static void main(String[] args) throws Exception {
        int N; int[] L;
        N = io.nextInt();
        L = new int[N];
        for(int i=0; i<N; i++){
            L[i] = io.nextInt();
        }
        int ans = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    if(L[i] == L[j] || L[j] == L[k] || L[i] == L[k]) continue;
                    long ml = Math.max(Math.max(L[i], L[j]), L[k]);
                    long tl = L[i] + L[j] + L[k];
                    if(ml < tl - ml){
                        ans++;
                    }
                }
            }
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
