import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    new Main();
  }
  public Main(){
    Scanner sc = new Scanner(System.in);
    int dataset = 0;
    while(true){
      ++dataset;
      int w = sc.nextInt();
      if(w==0)break;
      int n = sc.nextInt();
      int[] dp = new int[w+1];
      for(int i=0;i<=w;i++){
        dp[i] = -830252521;
      }
      dp[0] = 0;
      for(int i=0;i<n;i++){
        String[] s = (sc.next()).split(",");
        int val = Integer.parseInt(s[0]);
        int wei = Integer.parseInt(s[1]);
        for(int j=w;j>=0;j--){
          if(j+wei>w)continue;
          dp[j+wei] = Math.max(dp[j+wei],dp[j]+val);
        }
      }
      int answei = 0;
      for(int i=1;i<=w;i++){
        if(dp[i]>dp[answei]){
          answei = i;
        }
      }
      System.out.println("Case "+dataset+":");
      System.out.println(dp[answei]);
      System.out.println(answei);
    }
  }
}