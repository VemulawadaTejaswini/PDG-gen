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
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] scores = new int[n];
        tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) scores[i] = Integer.parseInt(tokenizer.nextToken());

        for (int i = k; i  < n; i++) {
            if (scores[i] > scores[i - k]) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        out.close();
    }
}