import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int ans = 0;
        List<Integer> array = new ArrayList<>(n);
        for(int i=0; i<n; i++) array.add(sc.nextInt());
        array.sort(Comparator.naturalOrder());
        // out.println(array.toString());
        for(int i=n -1; i>=0; i--){
            int target = array.get(i);
            // out.print(" target : " + target);
            for(int j =0; j<n; j++){
                int num = array.get(j);
                // out.print(" num : " + num);
                if(num > target / 2) break;
                if(target % num == 0){
                    ans++;
                    break;
                }
                // out.println();
                // out.println(ans);
            }
        }
        // out.println();
        out.println(ans);

        out.flush();

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}