import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = Integer.parseInt(sc.next());

      int n = 100010;

      int[] food = {100,101,102,103,104,105};

      int[] dp = new int[n];

      for(int i=0;i<n;i++){
        for(int j=0;j<6;j++){
          int now = dp[i] + food[j];
          if(now<100005){
            dp[now] = Math.max(dp[now],now);
          }
        }
      }

      if(dp[x]==x){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }


/*
      for(int i=0;i<6;i++){
        System.out.println(food[i]);
      }
*/


    }
}
