import java.util.*;

public class Main {
    static int[] array;
    static int n;
    static int h;
    static int w;
    static int k;
    static char[][] board;
    static int ans = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        
        // 全探索する時のデータを取得
        h = sc.nextInt();
        w = sc.nextInt();
        k = sc.nextInt();
        
        // board[i][j]: 迷路
        board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        n = h + w;
        // array: 長さnのbit列
        array = new int[n];
        
        // arrayのパターンを全探索
        // ex.[1, 1, 1], [1, 1, 2], ... , [m, m, m]
        dfs(0, 0);
        
        // ans: costの最小値
        System.out.println(ans);
    }
    
    public static void dfs(int index, int now) {
        // 終了条件
        if (index == n) {
            // できあがったarrayで計算
            
            char[][] tmpboard = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    tmpboard[i][j] = board[i][j];
                }
            }
            
            for (int i = 0; i < h; i++) {
                if (array[i] == 1) {
                    for (int j = 0; j < w; j++) {
                        tmpboard[i][j] = 'x';
                    }
                }
            }
            
            for (int i = h; i < n; i++) {
                if (array[i] == 1) {
                    for (int j = 0; j < h; j++) {
                        tmpboard[j][i-h] = 'x';
                    }
                }
            }
            
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (tmpboard[i][j] == '#') count++;
                }
            }
            
            if (count == k) ans++;
            return;
        }
        
        // 次項の取る値: 0 or 1
        for (int i = 0; i < 2; i++) {
            array[index] = i;
            dfs(index + 1, i);
        }
    }
}