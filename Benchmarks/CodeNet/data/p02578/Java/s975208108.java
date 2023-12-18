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

        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) ar[i] = Integer.parseInt(tokenizer.nextToken());

        long needed = 0;
        int maxSoFar = ar[0];
        for (int i = 1; i < n; i++) {
            if (ar[i] < maxSoFar) needed += maxSoFar - ar[i];
            maxSoFar = Math.max(maxSoFar, ar[i]);
        }

        out.println(needed);

        out.close();
    }
}