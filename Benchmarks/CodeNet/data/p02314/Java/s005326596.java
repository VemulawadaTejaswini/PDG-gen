public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j;
    int[] c, dp;
    n = sc.nextInt(); m = sc.nextInt();
    dp = new int[n + 1]; c = new int[m];
    for(i = 0;i < m;i++)c[i] = sc.nextInt();
    for(i = 0;i < n + 1;i++)dp[i] = n * 2;
    dp[0] = 0;
    for(i = 0;i < n + 1;i++)if(dp[i] != n * 2)
      for(j = 0;j < m;j++)if(i + c[j] <= n && dp[i] + 1 < dp[i + c[j]])
        dp[i + c[j]] = dp[i] + 1;
    out.println(dp[n]);


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}