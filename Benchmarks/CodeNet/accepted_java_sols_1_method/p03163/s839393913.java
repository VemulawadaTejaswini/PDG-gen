import java.util.Scanner;

class Main{
   
 public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

      //dp[i] = maximum value by having exact weight of i.
      long[] dp = new long[W+1];
      for(int i = 0; i < N; i++){
        int weight = sc.nextInt();
        int value = sc.nextInt();
        for(int wt = W; wt >= 0; wt--){
          if(wt >= weight){
          	dp[wt] = Math.max(dp[wt], dp[wt - weight] + value);
          }
        }
      }
   
   	  //long ans = 0;
      //for(int i = 0; i <= W; i++){
      //	ans = Math.max(ans, dp[i]);
      //}
      System.out.println(dp[W]);
   
      if(sc != null)
        sc.close();
  }
}
