import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int A[] = new int[n];
    for(int i = 0; i < n; i++){
      A[i] = Integer.parseInt(sc.next());
    }
    int q = Integer.parseInt(sc.next());
    int m[] = new int[q];
    int max = 0;
    for(int i = 0; i < q; i++){
      m[i] = Integer.parseInt(sc.next());
      if(m[i] > max){
        max = m[i];
      }
    }
    int dp[][] = new int[n + 1][max + 1];
    for(int j = 0; j < n + 1; j++){
      for(int k = 0; k < max + 1; k++){
        dp[j][k] = 0;
       }
    }
    dp[0][0] = 1;
    for(int j = 0; j < n; j++){
      for(int k = 0; k < max + 1; k++){
        if(k >= A[j] && dp[j][k - A[j]] == 1){
          dp[j + 1][k] = 1;
        }
        else if(dp[j][k] == 1){
          dp[j + 1][k] = 1;
        }
      }
    }
    for(int i = 0; i < q; i++){
      if(dp[n][m[i]] == 1){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
    }
  }
}
