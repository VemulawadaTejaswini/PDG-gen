import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int[] dp = new int[310];
        dp[0] = 1;
        for(int i=1; i*i<=300; i++){
            for(int j=300; j>=0; j--){
                for(int k=1; i*i*k+j<=300; k++){
                    if(dp[j]==0) continue;
                    dp[j+i*i*k] += dp[j];
                }
            }
        }

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            System.out.println(dp[n]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}