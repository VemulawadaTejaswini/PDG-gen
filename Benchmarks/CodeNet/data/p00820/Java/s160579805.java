import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int max = (int)Math.pow(2, 15) + 2;
        int[][] dp = new int[max][5];
        dp[0][0] = 1;
        for(int k=1; k*k<max; k++){
            for(int i=0; i<max; i++){
                if(i-k*k<0) continue;
                for(int j=1; j<5; j++){
                    dp[i][j] += dp[i-k*k][j-1];
                }
            }
        }

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int sum = 0;
            for(int i=0; i<5; i++) sum += dp[n][i];
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}