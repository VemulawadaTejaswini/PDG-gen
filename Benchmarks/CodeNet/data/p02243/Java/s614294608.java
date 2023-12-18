import java.util.Scanner;
public class Main {
    static final int MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] w = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = MAX;
            }
        }
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                int c = sc.nextInt();
                w[u][v] = c == -1 ? MAX : c;
            }
        }
        
        // cost from start point
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = MAX;
        }
        // スタートノード自身への最短距離（最小コスト）は 0. 
        // 全く移動しないで済むので，これは明らかに最適 (負のコストを持つエッジが一つでも存在すると，この推論が成り立たない. ダイクストラ法は「全てのエッジのコストが 0 以上であること」が条件.)
        d[0] = 0;
        boolean[] used = new boolean[n];
            
        // 確定ノードをピックアップすることができなくなるまで（＝変化がなくなるまで）以下のループを繰り返す：
        while (true) {
            // まだ確定されていないノードのうち，最小の値を持つノードを見つけ，確定ノードとする（確定フラグを立てる）。
            int minCost = MAX;
            int next = -1;
            for (int i = 0; i < n; i++) {
                if (d[i] < minCost && !used[i]) {
                    next = i;
                    minCost = d[i];
                }
            }
            if (next == -1) break;
            used[next] = true;
            
            // 確定ノードからの伸びているエッジをそれぞれチェックし，「確定ノードまでのコスト＋エッジのコスト」を計算し，そのノードの現在値よりも小さければ更新する
            for (int v = 0; v < n; v++) {
                if (!used[v] && w[next][v] != MAX) {
                    d[v] = Math.min(d[v], d[next] + w[next][v]);
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }
}

