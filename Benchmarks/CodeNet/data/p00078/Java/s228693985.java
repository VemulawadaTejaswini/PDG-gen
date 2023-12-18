public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, t;
    int[][] a;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n][n];
      t = 0;
      i = n / 2 + 1; j = n / 2;
      a[i][j] = ++t;
      for(;t < n * n;){
        if(a[++i % n][++j % n] == 0)a[i % n][j % n] = ++t;
        else a[++i % n][--j % n] = ++t;
      }

      for(i = 0;i < n;i++){
        for(j = 0;j < n;j++)out.printf("%4d", a[i][j]);
        out.println();
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}