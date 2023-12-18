public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[][] g;
    int i, j, u, v, k;

    n = sc.nextInt();
    g = new int[n][n];

    for(i = 0;i < n;i++){
      u = sc.nextInt();
      k = sc.nextInt();
      for(j = 0;j < k;j++){
        v = sc.nextInt();
        g[u - 1][v - 1] = 1;
      }
    }

    for(i = 0;i < n;i++){
      for(j = 0;j < n - 1;j++){
        System.out.print(g[i][j] + " ");
      }
      System.out.println(g[i][j]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}