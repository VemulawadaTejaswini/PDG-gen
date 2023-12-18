import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split(" ");
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(s[i]);
    }
    
    int dp[] = new int[N];
    dp[0] = 0;
    
    for(int i = 1; i<N; i++){
      if(i == 1){
        dp[i] += Math.abs(num[0] - num[1]);
      }else{
        int a = Math.abs(num[i] - num[i-1]) + dp[i-1];
        int b = Math.abs(num[i] - num[i-2]) + dp[i-2];
        dp[i] = (a > b ? b : a);
      }
    }
    System.out.println(dp[N-1]);
  }
}
