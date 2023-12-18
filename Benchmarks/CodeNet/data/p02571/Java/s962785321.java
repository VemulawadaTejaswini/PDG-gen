import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] s = f.readLine().toCharArray();
        char[] t = f.readLine().toCharArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length && s.length - i >= t.length; i++) {
            int diff = 0;
            for (int j = i, k = 0; k < t.length; k++, j++) {
                if (s[j] != t[k]) diff++;
            }
            min = Math.min(min, diff);

        }

        out.println(min);
        out.close();
    }
}