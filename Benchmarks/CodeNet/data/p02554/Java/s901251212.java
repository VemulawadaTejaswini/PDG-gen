import java.util.*;
import java.io.*;
 
public class Main{
  Scanner sc = new Scanner(System.in);	
 
  public void run(){
    int n = sc.nextInt();
    long mod = 1_000_000_000 + 7;
    
    long dp[] = new long[4];
    int no09 = 0;
    int have0 = 1;
    int have9 = 2;
    int have09 = 3;
    dp[no09] = 1;
    
    for(int i = 0;i < n;i++){
      long next[] = new long[4];
      next[no09] = (dp[no09] * 8)%mod; 
      next[have0] = (dp[have0] * 8 + dp[no09])%mod;  
      next[have9] = (dp[have9] * 8 + dp[no09])%mod;  
      next[have09] = (dp[have09] * 8 + dp[have0] + dp[have9])%mod;
      dp = next; 
      System.err.println(Arrays.toString(dp));
    }
    System.out.println(dp[have09]);
  }
  public static void main(String[] args){
    Main m = new Main();
    m.run();
  }
}