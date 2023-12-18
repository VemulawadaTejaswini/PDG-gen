import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        // onair[i][j]: チャンネルiの時刻jが放送中ならtrue
        boolean[][] onair = new boolean[c][100005];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ch = sc.nextInt() - 1;
            
            for (int j = start; j <= end; j++) {
                onair[ch][j] = true;
            }
        }
        
        // ans: 同時放送チャンネル数
        int ans = 0;
        for (int i = 0; i < 100005; i++) {
            int count = 0;
            for (int ch = 0; ch < c; ch++) {
                if (onair[ch][i]) {
                    count++;
                }
            }
            
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}
