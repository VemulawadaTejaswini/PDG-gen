import java.util.*;
public class Main {
  
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int ind = 0; ind < n; ind++) {
      arr[ind] = sc.nextInt();
    }
    if(n == 1)
    {
      System.out.println(0);
      return;
    }
    if(n == 2) {
      System.out.println(Math.abs(arr[1] - arr[0]));
      return;
    }
    int[] dp = new int[n];
    dp[1] = Math.abs(arr[1] - arr[0]);
    for(int ind = 2; ind < n;ind++) {
      int cost1 = Math.abs(arr[ind] - arr[ind - 1]) + dp[ind - 1];
      int cost2 = Math.abs(arr[ind] - arr[ind - 2]) + dp[ind - 2];
      if(cost1 < cost2)
        dp[ind] = cost1;
      else
        dp[ind] = cost2;
    }

    System.out.println(dp[arr.length - 1]);
  }
}
