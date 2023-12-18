import java.util.*;

public class Main{

    int W;
    int[] w,w2;
    int[] dp,dp2;
    int odd = 45,all = 180;
    int INF = 1000000, max = 1000000;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int oddI = 0;
        w = new int[180];
        w2 = new int[45];
        for(int i=1,j=i*(i+1)*(i+2)/6; j<max; i++,j=i*(i+1)*(i+2)/6){
            w[i-1] = j;
            if(j%2!=0) w2[oddI++] = j;
        }

        dp();

        while(true){
            W = sc.nextInt();
            if(W==0) break;

            System.out.println(dp[W]+" "+dp2[W]);
        }
    }

    void dp(){
        dp = new int[max]; dp2 = new int[max];
        Arrays.fill(dp,INF); Arrays.fill(dp2,INF);
        dp[0] = 0; dp2[0] = 0;
        for(int i=0; i<all-1; i++){
            for(int j=0; j<max; j++){
                if(j-w[i]>=0){
                    dp[j] = Math.min(dp[j], dp[j-w[i]]+1);
                }
                if(i<odd && j-w2[i]>=0){
                    dp2[j] = Math.min(dp2[j], dp2[j-w2[i]]+1);
                }
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}