import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();

            int n = s1.length;
            int m = s2.length;

            int[][] dp = new int[n+1][m+1];
            
            int max = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(s1[i]==s2[j]){
                        dp[i+1][j+1] = dp[i][j]+1;
                        max = Math.max(max, dp[i+1][j+1]);
                    }
                }
            }
            
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}