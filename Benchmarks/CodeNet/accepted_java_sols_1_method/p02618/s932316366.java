import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        // type: コンテスト種類数
        int type = 26;
        
        // n: 1～n日目まで開催
        int n = sc.nextInt();
        
        // c[t]: コンテストtのマイナス係数
        int[] c = new int[type];
        for (int i = 0; i < type; i++) {
            c[i] = sc.nextInt();
        }
        
        // s[d][t]: コンテストtをd日目に開くと増加する満足度
        int[][] s = new int[n+1][type];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        // last[t]: コンテストtが最近何日目に開催されたか
        int[] last = new int[type];
        
        // t[d]: d日目に開催するコンテストは何か
        int[] t = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            System.out.println(1);
        }
    }
}
