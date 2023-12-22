import java.util.*;

public class Main {
        public static final int INF = 1<<30;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[200000];
        Arrays.fill(dp,INF);
        int[] damage = new int[10010];
        int[] magic = new int[10010];
        //dp[H] ... 体力Hを減らすために必要な魔力の最小値\
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        for(int i=0;i<N;i++){
            damage[i] = Integer.parseInt(sc.next());
            magic[i] = Integer.parseInt(sc.next());
        }
        int maxD = 0;
        for(int x : damage){
            maxD = Math.max(maxD,x);
        }
        dp[0] = 0;
        for(int i=1;i<=H+maxD;i++){
            for(int j=0;j<N;j++){
                if(damage[j] - i <= 0){
                    dp[i] = Math.min(dp[i],dp[i-damage[j]] + magic[j]);
                }
            }
        }
        int res = INF;
        for(int i=H;i<H+maxD;i++){
            res = Math.min(res,dp[i]);
        }
      System.out.println(res);
    }
}
