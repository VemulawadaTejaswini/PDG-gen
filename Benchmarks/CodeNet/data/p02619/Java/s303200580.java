import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int type = 26;
        int n = sc.nextInt();
        int[] c = new int[type];
        int[][] s = new int[n+1][type];
        for (int i = 0; i < type; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        int[] last = new int[type];
        
        int[] t = new int[n+1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt() - 1;
        }
        
        int ans = 0;
        
        // 1日毎に計算する
        for (int i = 1; i <= n; i++) {
            // 開催するコンテストを選択
            int contest = t[i];
            last[contest] = i;
            
            // 満足度上昇
            ans += s[i][contest];
            
            // 満足度減少
            for (int j = 0; j < type; j++) {
                ans -= c[j] * (i - last[j]);
            }
            System.out.println(ans);
        }
    }
}
