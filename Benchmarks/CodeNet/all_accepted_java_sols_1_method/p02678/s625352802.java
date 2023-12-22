import java.util.*;

public class Main {
    static int INF = 1001001009;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s); 
        }
        
        
        // visited: 当該点を既に通ったか否か 
        boolean[] visited = new boolean[n];
        visited[0] = true;
        
        // last: 各点の最終値
        int[] num = new int[n];
        Arrays.fill(num, INF);
        // 頂点0から順に、親から子へ初期値を配り最終値を求める
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{0, -1});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int p = cur[0];
            int par = cur[1];
            
            for (Integer q : to[p]) {
                if (!visited[q]) {
                    que.add(new int[]{q, p});
                    visited[q] = true;
                    num[q] = p;
                }
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (num[i] == INF) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(num[i]+1);
        }
    }
}