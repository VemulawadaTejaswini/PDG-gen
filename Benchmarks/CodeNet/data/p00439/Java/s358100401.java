
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += ar[i];
        }
        int ans = sum;
        for (int i = k; i < n; i++) {
            sum += ar[i] - ar[i - k];
            ans = Math.max(ans, sum);
        }
        
        System.out.println(ans);
    }
    
    int[][] dp;
    void dfs(int n, int p, int s) {
        if (p == 10)
            return;
        for (int i = n; i < 10; i++) {
            dp[p][s + i]++;
            dfs(i + 1, p + 1, s + i);
        }
    }
    
    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}