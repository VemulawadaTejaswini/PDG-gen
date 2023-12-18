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
        // setp: 爆弾の存在する点の集合
        int[] countr = new int[h];
        int[] countc = new int[w];
        Set<Integer> setr = new HashSet<Integer>();
        Set<Integer> setc = new HashSet<Integer>();
        Set<String> setp = new HashSet<String>();
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            countr[row]++;
            countc[col]++;
            setr.add(row);
            setc.add(col);
            setp.add(row + " " + col);
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
        
        setr = new HashSet<Integer>();
        for (int i = 0; i < h; i++) {
            if (maxr == countr[i]) setr.add(i);
        }
        setc = new HashSet<Integer>();
        for (int i = 0; i < w; i++) {
            if (maxc == countc[i]) setc.add(i);
        }
        
        // maxrかつmaxcの(r, c)について全探索
        // (r, c)がsetpになければ++する
        boolean ok = false;
        for (Integer r : setr) {
            for (Integer c : setc) {
                String p = r + " " + c;
                if (!setp.contains(p)) ok = true;
            }
        }
        
        ans = maxr + maxc - 1;
        if (ok) ans++;
        System.out.println(ans);
    }
}
