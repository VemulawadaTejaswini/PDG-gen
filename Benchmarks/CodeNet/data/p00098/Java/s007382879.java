public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, res, w, h, x;
    int[][] f, sum;

    n = sc.nextInt();
    f = new int[n][n];
    for(i = 0;i < n;i++)for(j = 0;j < n;j++)f[i][j] = sc.nextInt();
    sum = new int[++n][n];

    sum[1][1] = f[0][0];
    for(j = 2;j < n;j++)sum[1][j] = sum[1][j - 1] + f[0][j - 1];
    for(i = 2;i < n;i++)sum[i][1] = sum[i - 1][1] + f[i - 1][0];
    for(i = 2;i < n;i++)for(j = 2;j < n;j++)
      sum[i][j] = f[i - 1][j - 1] + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];

    res = f[0][0];
    for(h = 0;h < n;h++)for(i = 1;i < n - h;i++)
    for(w = 0;w < n;w++)for(j = 1;j < n - w;j++){
      x = sum[i + h][j + w] - sum[i - 1][j + w] - sum[i + h][j - 1] + sum[i - 1][j - 1];
      if(res < x)res = x;
    }
    out.println(res);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}