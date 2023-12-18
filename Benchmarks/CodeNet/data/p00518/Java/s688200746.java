import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        int mod = 10007;

        int n = sc.nextInt();
        char[] line = sc.next().toCharArray();
        int[] tanto = new int[n];
        for(int i=0; i<n; i++){
            if(line[i]=='J') tanto[i] = 0;
            if(line[i]=='O') tanto[i] = 1;
            if(line[i]=='I') tanto[i] = 2;
        }

        int[][] dp = new int[n][1<<3];
        int idx = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int bit=0; bit<(1<<3); bit++){
                if((bit&(1<<tanto[i]))==0) continue;
                if(i==0){
                    if((bit&1)>0) dp[i][bit] = 1;
                    continue;
                }
                for(int bit2=0; bit2<(1<<3); bit2++){
                    if((bit&bit2)>0){
                        dp[i][bit] += dp[i-1][bit2];
                        dp[i][bit] %= mod;
                    }
                }
                if(i==n-1){
                    sum += dp[i][bit];
                    sum %= mod;
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}