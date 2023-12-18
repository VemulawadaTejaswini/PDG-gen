import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        
        // ans: r行すべてとc列すべてにある爆弾の個数の最大値
        int ans = 0;
        
        // countr, countc: 各行各列に存在する爆弾の個数
        // setr, setc: 爆弾の存在する行、列の集合
        // rc: 爆弾の存在する点の配列
        int[] countr = new int[h];
        int[] countc = new int[w];
        Set<Integer> setr = new HashSet<Integer>();
        Set<Integer> setc = new HashSet<Integer>();
        int[][] rc = new int[m][2];
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            countr[row]++;
            countc[col]++;
            setr.add(row);
            setc.add(col);
            rc[i] = new int[]{row, col};
        }
        
        // maxr, maxc: countr, countcの最大値
        int maxr = 0;
        for (int i = 0; i < h; i++) {
            maxr = Math.max(maxr, countr[i]);
        }
        int maxc = 0;
        for (int i = 0; i < w; i++) {
            maxc = Math.max(maxc, countc[i]);
        }
        
        // maxrかつmaxcの(r, c)について全探索
        // (r, c)がsetpにあれば--する
        for (Integer r : setr) {
            if (countr[r] != maxr) continue;
            for (Integer c : setc) {
                if (countc[c] != maxc) continue;
                
                int res = countr[r] + countc[c];
                long p = (long)r * 1000000 + c;
                for (int i = 0; i < m; i++) {
                    int row = rc[i][0];
                    int col = rc[i][1];
                    if (r == row && c == col) res--;
                }
                
                ans = Math.max(ans, res);
                // System.out.println(res);
            }
        }
        System.out.println(ans);
    }
}
