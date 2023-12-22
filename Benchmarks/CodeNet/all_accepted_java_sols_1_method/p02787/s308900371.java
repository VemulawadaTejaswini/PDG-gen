import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt(); 
    
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    
    for(int i = 0; i < n; i++){
      int tmp1 = sc.nextInt();
      int tmp2 = sc.nextInt();
      a.add(tmp1);
      b.add(tmp2);
    }
    
    long[][] dp = new long[n+1][h+1];
    
    for(int i = 0; i < dp.length; i++){
      for(int j = 0; j < dp[i].length; j++){
        dp[i][j] = Long.MAX_VALUE;
      }
    }
    
    dp[0][0] = 0;
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j <= h; j++){
        if(dp[i][j] != Long.MAX_VALUE){
          int index = Math.min(h,j+a.get(i));
          
          dp[i][index] = Math.min(dp[i][index], dp[i][j] + b.get(i));
          dp[i+1][j] = Math.min(dp[i][j], dp[i+1][j]);
          dp[i+1][index] = Math.min(dp[i+1][index], dp[i][j] + b.get(i));
        }
        
        if(j < a.get(i)){
          dp[i+1][j] = dp[i][j];
        }else{
          if(dp[i+1][j-a.get(i)] == Long.MAX_VALUE){
            dp[i+1][j] = Math.min(dp[i][j], Long.MAX_VALUE);
          }else{
            dp[i+1][j] = Math.min(dp[i][j], dp[i+1][j-a.get(i)] + b.get(i));
          }
        }
      }
    }
    

    System.out.println(dp[n][h]);
  }
}