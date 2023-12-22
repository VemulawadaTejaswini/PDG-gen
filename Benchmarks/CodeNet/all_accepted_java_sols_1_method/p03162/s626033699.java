import java.util.*;

public class Main {
    public static final long INF = Long.MAX_VALUE >> 2;
    public static final int SIZE = 110000;
    public static long[][] dp = new long[SIZE][3]; //制約に応じてテーブル規模を調節する
    //dp[DAY][DID] -> DAY日目までの幸福度の総和の最大値と、前日にした行動(DID)
    public static long[][] happiness = new long[SIZE][3];//制約に応じてテーブル規模を調節する
    //happiness[DAY][VALUE] -> DAY日目の幸福度(VALUE)
    public static void main(String[] args) throws Exception {
       for(int i=0;i<SIZE;++i){
           for(int j=0;j<3;j++){
                dp[i][j] = 0;   
           }
       }
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       for(int i=0;i<N;i++){
           for(int j=0;j<3;j++){
               happiness[i][j] = sc.nextInt();
           }
       }
       for(int i=1;i<=N;i++){
               for(int j=0;j<3;j++){
                   for(int k=0;k<3;k++){
                       if(j == k) continue;
                       dp[i][k] = Math.max(dp[i][k],dp[i-1][j] + happiness[i-1][k]);
                   }
               }
           }
        long res = 0;
        for(int j=0;j<3;j++)res = Math.max(res,dp[N][j]);
        System.out.println(res);
       }
    }