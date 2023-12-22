import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n, k;
            n = reader.nextInt();
            k = reader.nextInt();

            boolean haveSnacks[] = new boolean[n];

            for (int j = 0; j < k; j++) {
                int d = reader.nextInt();
                for (int x = 0; x < d; x++) {
                    int a = reader.nextInt();
                    haveSnacks[a - 1] = true;
                }
            }
            
            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (!haveSnacks[j])
                    ans++;
            }
            
            log.write(ans + "\n");
            log.flush();
            log.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}