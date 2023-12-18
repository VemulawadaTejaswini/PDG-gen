import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        //int max = 30;
        int max = (int)Math.pow(2, 15) + 10;
        int[][] dp = new int[5][max];
        dp[0][0] = 1;
        for(int j=1; j*j<max; j++){
            for(int i=1; i<5; i++){
                for(int sum=j*j; sum<max; sum++){
                    dp[i][sum] += dp[i-1][sum-j*j];
                }
            }
        }

        int n = sc.nextInt();
        while(n!=0){
            int cnt = 0;
            for(int i=0; i<5; i++) cnt += dp[i][n];
            System.out.println(cnt);
            n = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}