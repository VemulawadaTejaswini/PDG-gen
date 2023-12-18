
import java.io.*;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
    // main solver
    static class Task{
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int cnt[] = new int[1000001];
            for (int i = 0; i < n; i++){
                cnt[in.nextInt()]++;
            }
            int  result = 0;
            for (int i =  1; i <= 1000000; i++){
                if (cnt[i] == 1){
                    boolean ok = true;
                    for (int j = 2 * i; j <= 1000000; j += i){
                        if (cnt[j] != 0) {
                            ok = false; break;
                        }
                    }
                    if (ok) result++;
                }
            }
            out.println(result);
        }
    }
    // fast input reader class;
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
        public long nextLong(){
            return Long.parseLong(nextToken());
        }
    }
}