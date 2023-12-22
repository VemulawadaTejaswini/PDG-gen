/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int a=sc.nextInt();
        int X=a;
        int[] x=new int[n+1];
        for (int i = 1; i <= n; i++) {
            x[i]=sc.nextInt();
            X=max(x[i],X);
            x[i]-=a;
        }
        long[][] dp=new long[n+1][2*n*X+1];
        dp[0][n*X]=1;
        for (int i = 1; i <= n; i++) {
            for (int t = 0; t <= 2*n*X; t++) {
                if(t-x[i]<0||t-x[i]>2*n*X)dp[i][t]=dp[i-1][t];
                else if(0<=t-x[i]&&t-x[i]<=2*n*X)dp[i][t]=dp[i-1][t]+dp[i-1][t-x[i]];
            }
        }
        out.println(dp[n][n*X]-1);
    }
}