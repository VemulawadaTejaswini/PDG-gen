import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int W = Integer.parseInt(sc.next());

      long[][] dp = new long[n][W+1];

      long[] w = new long[n];
      long[] v = new long[n];
      for(int i=0;i<n;i++){
        w[i] = Long.parseLong(sc.next()); //w
        v[i] = Long.parseLong(sc.next()); //v
      }

        for(int j=0;j<=W;j++){
          if(w[0]<=j){
            dp[0][j] = v[0];
          }
        }


      for(int i=1;i<n;i++){ //今選ぼうとしてるやつ
        for(int j=0;j<=W;j++){ //選ぶ前の重さ
          if(j-w[i]>=0){ //w[i]を足した後は当然w>=j>=w[i]。
            dp[i][j] = Math.max(dp[i][j],dp[i-1][j-(int)w[i]]+v[i]);
          }
         //超えるなら選べない or i単体の方が大きい。
         dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
        }
      }

      System.out.println(dp[n-1][W]);
/*
      for(int i=0;i<n;i++){
        for(int j=0;j<=W;j++){
          if(j!=W){System.out.print(dp[i][j]+" ");}
          else{System.out.println(dp[i][j]);}
        }
      }
*/

    }
}
