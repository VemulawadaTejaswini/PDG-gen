import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int m = sc.nextInt();
            int l = sc.nextInt();
            ArrayList<HashMap<Integer, Cost>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new HashMap<>());
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1; 
                Cost cost = new Cost(sc.nextInt(), sc.nextInt());
                graph.get(a).put(b, cost);
                graph.get(b).put(a, cost);
            }
            int[][] dp = new int[n][l + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }
            search(0, 0, l, dp, graph);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= l; i++) {
                min = Math.min(min, dp[n - 1][i]);
            }
            sb.append(min).append("\n");
        }
        System.out.print(sb);
    }
    
    static void search(int idx, int count, int remain, int[][] dp, ArrayList<HashMap<Integer, Cost>> graph) {
        if (remain < 0) {
            return;
        }
        if (dp[idx][remain] <= count) {
            return;
        }
        for (int i = remain; i >= 0 && dp[idx][i] > count; i--) {
            dp[idx][i] = count;
        }
        for (Map.Entry<Integer, Cost> entry : graph.get(idx).entrySet()) {
            int next = entry.getKey();
            Cost cost = entry.getValue();
            search(next, count, remain - cost.value, dp, graph);
            search(next, count + cost.count, remain, dp, graph);
        }
    }
    
    static class Cost {
        int count;
        int value;
        
        public Cost(int value, int count) {
            this.count = count;
            this.value = value;
        }
    }
}
