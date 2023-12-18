import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int res = 1000;
        for(int i = 1; i <= n; i++){
            dp[i] = sc.nextInt();
        }
        int buy = 201;
        int sell = 0;
        for(int i = 1; i <= n; i++){
            if(dp[i] <= buy)
                buy = dp[i];
            else{
                if(dp[i] > sell){
                    sell = dp[i];
                }else {
                    int earn = res / buy * sell;
                    res %= buy;
                    res += earn;
                    buy = dp[i];
                    sell = 0;
                }
            }
        }
        if(sell > buy){
            int earn = res / buy * sell;
            res %= buy;
            res += earn;
        }
        System.out.println(res);
    }
}