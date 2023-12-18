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
        int d = Integer.parseInt(tokenizer.nextToken());
        int t = Integer.parseInt(tokenizer.nextToken());
        int s = Integer.parseInt(tokenizer.nextToken());

        if (((long) t * s) >= d) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        out.close();
    }
}