import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int max = 1130;
        boolean[] prime = new boolean[max];
        for(int i=2; i<max; i++) prime[i] = true;
        for(int i=2; i<prime.length; i++){
            for(int j=i*2; j<prime.length; j+=i){
                prime[j] = false;
            }
        }

        int[][] dp = new int[15][max];
        /*
        for(int i=0; i<max; i++){
            if(prime[i]) dp[1][i] = 1;
        }
        */
        dp[0][0] = 1;
        for(int i=0; i<max; i++){
            if(!prime[i]) continue;
            for(int j=14; j>=1; j--){
                for(int k=max-1; k>=i; k--){
                    dp[j][k] += dp[j-1][k-i];
                }
            }
        }

        int n = sc.nextInt();
        int k = sc.nextInt();
        while(n!=0 || k!=0){
            System.out.println(dp[k][n]);
            n = sc.nextInt();
            k = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}