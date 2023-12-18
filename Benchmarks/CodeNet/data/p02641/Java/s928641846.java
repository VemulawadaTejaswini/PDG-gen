
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
            int x = in.nextInt();
            int n = in.nextInt();
            int p[] = new int[n];
            boolean[] visited = new boolean[101];
            for (int i = 0; i < n; i++){
                int num = in.nextInt();
                visited[num] = true;
            }
            int more = 101, less = 0;
            for (int i = x; i >= 0; i--){
                if (!visited[i]){
                    less = i;
                    break;
                }
            }
            for (int i = x + 1; i <= 100; i++){
                if (!visited[i]){
                    more = i;
                    break;
                }
            }
            if  (more - x < x - less){
                out.println(more);
            }
            else{
                out.println(less);
            }
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