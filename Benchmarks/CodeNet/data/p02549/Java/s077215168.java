
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/19 7:53 下午
 */
public class Main {
    private static int MOD = 998244353;
    private static int[] dp = new int[200005];
    private static int[] v = new int[200005];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int index = 0;
        for(int i = 0;i<k;i++){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for(int j = l;j<=r;j++){
                v[index++] = j;
            }
        }
        dp[0] = 1;
        for(int i=1;i<n;i++) {
            for(int j = 0;j<index;j++){
                if( i >= v[j]){
                    dp[i] = (dp[i] + dp[i-v[j]])%MOD;
                }
            }
        }
        System.out.println(dp[n-1]);
    }
}
