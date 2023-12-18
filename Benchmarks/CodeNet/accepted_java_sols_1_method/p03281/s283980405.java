import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] dp = new int[201];
        dp[0] = 0;
        for(int i=1; i<=200; i++) {
            dp[i] = dp[i-1];
            int count = 0;
            if(i % 2 == 0) {
                continue;
            }
            for(int j=1; j<=i; j++) {
                
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 8) {
                dp[i]++;
            }
        }
        System.out.println(dp[N]);
        
    }
    
}