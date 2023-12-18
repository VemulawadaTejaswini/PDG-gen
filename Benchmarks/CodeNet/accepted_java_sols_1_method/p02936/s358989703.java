import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        
        // リストの作成
        for (int i = 0; i < n - 1; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s); 
        }
        
        int[] first = new int[n];
        for (int i = 0; i < k; i++) {
            int p = sc.nextInt() - 1;
            int count = sc.nextInt();
            first[p] += count;
        }
        
        int[] last = new int[n];
        
        // visited[i][j]: 当該マスを既に通ったか否か
        boolean[] visited = new boolean[n];
        visited[0] = true;
        
        // steps = BFS((0, 0)→(h, w)までの最短経路の深さ)
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{0, 0});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int p = cur[0];
            int count = cur[1] + first[p];
            last[p] = count;
            
            for (Integer q : to[p]) {
                if (!visited[q]) {
                    que.add(new int[]{q, count});
                    visited[q] = true;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(last[i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}