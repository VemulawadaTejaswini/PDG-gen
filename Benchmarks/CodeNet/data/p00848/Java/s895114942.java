import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int max = 1130;
        boolean[] p = new boolean[max];
        for(int i=2; i<max; i++) p[i] = true;
        for(int i=2; i<Math.sqrt(max); i++){
            for(int j=i*i; j<max; j+=i) p[j] = false;
        }

        int[][] dp = new int[max][15];
        dp[0][0] = 1;
        for(int s=0; s<max; s++){
            if(!p[s]) continue;
            for(int i=max-1; i>=s; i--){
                for(int j=1; j<15; j++){
                    dp[i][j] += dp[i-s][j-1];
                }
            }
        }


        while(true){
            int n = sc.nextInt(), k = sc.nextInt();
            if(n==0 && k==0) break;
            System.out.println(dp[n][k]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}