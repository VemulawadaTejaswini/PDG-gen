import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int n = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(f.readLine());
        int minNum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            treeSet.add(Integer.parseInt(tokenizer.nextToken()));
        }
        for (int i = 0; i <= 101; i++) {
            if (!treeSet.contains(i) && Math.abs(x - i) < minDiff) {
                minNum = i;
                minDiff = Math.abs(x - i);
            }
        }

        System.out.println(minNum);
    }
}
