import java.util.*;

public class Main2{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = 1000000000;

        int n = sc.nextInt();
        int[][] ab = new int[n][2];
        for(int i=0; i<n; i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }

        Arrays.sort(ab, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[1] - b[1];
                }
            });

        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++) Arrays.fill(dp[i],INF);
        for(int i=0; i<=n; i++) dp[i][0] = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(dp[i][j]+ab[i][0]<=ab[i][1]){
                    dp[i+1][j+1] = Math.min(dp[i][j]+ab[i][0],
                                            dp[i][j+1]);
                }
            }
        }

        int ans = 0;
        for(int i=0; i<=n; i++){
            if(dp[n][i]!=INF) ans = Math.max(ans,i);
        }

        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main2().solve();
    }
}