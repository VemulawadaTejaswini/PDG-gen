import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int W=sc.nextInt();
        long[][] dp=new long[n+1][W+1];
        dp[0][0]=0;
        int[] v=new int[n];
        int[] w=new int[n];
        for (int i = 0; i < n; i++) {
            v[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        int weight=0;
        long ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=W ; j++) {
                if(j>=w[i]){
                    dp[i+1][j]=max(dp[i][j-w[i]]+v[i],dp[i][j]);
                }else{
                    dp[i+1][j]=dp[i][j];
                }
            }
        }
        out.println(dp[n][W]);
    }
}
