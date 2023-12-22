import java.util.*;
public class Main {
    public static void main(String argd[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int asi[] = new int[N];
        int dp[] = new int[N];
        for(int i = 0; i < N; i++){
            asi[i] = sc.nextInt();
            dp[i] = 2000000000;
        }
        dp[0] = 0;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j <= K + i && j < dp.length; j++){
                if(dp[j] > dp[i] + Math.abs(asi[i] - asi[j])) dp[j] =  Math.abs(asi[i] - asi[j]) + dp[i];
            }
        }
        System.out.println(dp[N - 1]);
        
    }
    
}