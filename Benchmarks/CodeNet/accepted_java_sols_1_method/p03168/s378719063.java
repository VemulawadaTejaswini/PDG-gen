import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] p = new double[n];
        for(int i = 0; i < n; i++){
            p[i] = scanner.nextDouble();
        }
        double[] dp = new double[n+1];
        dp[0] = 1;
        double pre = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                double t = dp[j];
                if(j == 0){
                    dp[j] *= (1 - p[i-1]);
                }else{
                    dp[j] = p[i-1] * pre + (1 - p[i-1]) * dp[j];
                }
                pre = t;
            }
        }
        double ans = 0;
        for(int i = n / 2 + 1; i <= n; i++){
            ans += dp[i];
        }
        System.out.println(ans);
    }
}
