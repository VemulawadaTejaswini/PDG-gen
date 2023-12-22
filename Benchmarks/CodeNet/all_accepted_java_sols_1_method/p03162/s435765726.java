import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int dp[][] = new int[N][3];
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            if(i==0){
                dp[i][0] = a;
                dp[i][1] = b;
                dp[i][2] = c;
            }else{
                dp[i][0] = Math.max(dp[i-1][1]+a, dp[i-1][2]+a);
                dp[i][1] = Math.max(dp[i-1][0]+b, dp[i-1][2]+b);
                dp[i][2] = Math.max(dp[i-1][0]+c, dp[i-1][1]+c);
            }
        }
        System.out.println(Math.max(Math.max(dp[N-1][0],dp[N-1][1]),dp[N-1][2]));
    }
}
