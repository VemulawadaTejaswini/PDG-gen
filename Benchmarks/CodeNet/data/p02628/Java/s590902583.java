import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
        int value = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(tokenizer.nextToken()));
        }
        for (int i = 0; i < k; i++) {
            value += pq.remove();
        }
        out.println(value);
        out.close();
    }
}
