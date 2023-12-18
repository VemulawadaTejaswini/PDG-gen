import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    int[] goesTo;
    int[] value;
    boolean[] onStack;

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        goesTo = new int[n];
        tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) goesTo[i] = Integer.parseInt(tokenizer.nextToken()) - 1;
        value = new int[n];
        tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) value[i] = Integer.parseInt(tokenizer.nextToken());

        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            onStack = new boolean[n];
            max = Math.max(max, dfs(goesTo[i], k, new ArrayDeque<Integer>()));
        }
        out.println(max);
        out.close();
    }

    private long dfs(int node, int k, ArrayDeque<Integer> stack) {
        if (k == 0) return 0;

        if (onStack[node]) {
            long circleSum = 0;
            int circleLength = 0;
            ArrayDeque<Integer> circle = new ArrayDeque<Integer>();
            while (stack.peekFirst() != node) {
                int circleNode = stack.removeFirst();
                circleSum += value[circleNode];
                circle.addFirst(circleNode);
                circleLength++;
            }
            circleLength++;
            circleSum += value[stack.removeFirst()];
            circle.addFirst(node);
            if (circle.size() != circleLength) return 1000000000000000000L;
            long sum1 = (k / circleLength) * circleSum;
            int mod = k % circleLength;
            long maxCurrentSum = 0;
            long currentSum = 0;
            for (int i = 0; i < mod; i++) {
                currentSum += value[circle.removeFirst()];
                maxCurrentSum = Math.max(currentSum, maxCurrentSum);
            }
            long sum = Math.max(sum1, 0) + maxCurrentSum;
            //System.out.println(sum1 + " " + maxCurrentSum + " " + circleLength + " " + (k / circleLength) + " " + circleSum);
            return sum;
        }

        long sum = value[node];
        stack.addFirst(node);
        onStack[node] = true;
        long otherSum = dfs(goesTo[node], k - 1, stack);
        if (otherSum > 0) sum += otherSum;
        return sum;
    }
}