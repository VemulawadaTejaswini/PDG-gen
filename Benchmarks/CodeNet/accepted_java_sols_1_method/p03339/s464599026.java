import java.util.*;
 
public class Main{

       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();

        int[] dp = new int[N];//i番目の左にいる西を向いた人数
        dp[0] = 0;
        for(int i = 1; i < N; i++){
            if(S.charAt(i-1) == 'W'){
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = dp[i-1];
            }
        }
        int min = N;
        for(int i = 0; i < N; i++){
            if(S.charAt(N-1) == 'W' && i != N-1)
                min = Math.min(min, dp[i] + N - i - 1 - dp[N-1]+dp[i]);
            if(S.charAt(N-1) == 'E' && i != N-1)
                min = Math.min(min, dp[i] + N - i - dp[N-1]+dp[i]);
            if(i == N-1)
                min = Math.min(min, dp[i]);
        }
        System.out.println(min);
    }
}