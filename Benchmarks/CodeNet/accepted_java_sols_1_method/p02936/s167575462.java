import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int query = sc.nextInt();
        
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s);
        }
        
        int[] dist = new int[n];
        for (int i = 0; i < query; i++) {
            int p = sc.nextInt() - 1;
            int dis = sc.nextInt();
            dist[p] += dis;
        }
        
        boolean[] visited = new boolean[n];
        
        // 頂点0から順に、親から子へ初期値を配り最終値を求める
        Queue<Integer> que = new ArrayDeque<Integer>();
        que.add(0);
        visited[0] = true;
        while (!que.isEmpty()) {
            int p = que.poll();
            int dis = dist[p];
            
            
            for (Integer q : to[p]) {
                if (visited[q]) continue;
                dist[q] += dis;
                que.add(q);
                visited[q] = true;
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            System.out.print(dist[i]);
            
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}