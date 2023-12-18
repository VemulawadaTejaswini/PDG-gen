import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int res = -1;
        for (int i = 1; i <= 5; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            if (num == 0) {
                res = i;
            }
        }

        System.out.println(res);
    }
}
