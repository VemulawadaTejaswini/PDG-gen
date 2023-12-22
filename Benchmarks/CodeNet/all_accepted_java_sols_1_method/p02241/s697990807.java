
import java.util.*;
public class Main {
    static final int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] w = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int  k = sc.nextInt();
                w[i][j] = k == -1 ? MAX : k;
            }
        }
        
        int sumCost = 0;
        boolean[] used = new boolean[n+1];
        // minCostFromMST[i]: 作成中 MST(どの頂点でもよい) から,未訪問の頂点 i に移動するための最小コスト。
        int[] minCostFromTempMST = new int[n+1]; 
        
        for (int i = 1; i <= n; i++) {
            minCostFromTempMST[i] = MAX;
        }
        // 頂点1以外は何で初期化する? -> とりあえず-1 -> minCostとの比較で支障が出そうなのでMAX
        minCostFromTempMST[1] = 0;
        
        while (true) {
            // 次に訪問する頂点と, 作成中MSTとG-MSTの中で最小コストの辺のコスト
            int next = -1;
            int minCost = MAX;
            
            // 「未訪問で、作成中MSTからもっとも近い頂点」をnextにする。初回は頂点1が選ばれる
            for (int i = 1; i <= n; i++) {
                if (!used[i] && minCostFromTempMST[i] < minCost) {
                    next = i;
                    minCost = minCostFromTempMST[i];
                }
            }
            if (next == -1) break;
            
            used[next] = true;
            sumCost += minCostFromTempMST[next];
            for (int i = 1; i <= n; i++) {
                // 「未訪問で、nextと隣接する頂点」 の minCostFromTempMST を更新する。
                if (!used[i] && w[next][i] != MAX) {
                    minCostFromTempMST[i] = Math.min(minCostFromTempMST[i], w[next][i]);
                }
            }
        }
        System.out.println(sumCost);
    }
}

