public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    int[] b;
    int[][] a;
    int i, j;
    int[] c;

    n = sc.nextInt();
    m = sc.nextInt();
    b = new int[m];
    a = new int[n][m];
    c = new int[n];

    for(i = 0;i < n;i++){
      for(j = 0;j < m;j++){
        a[i][j] = sc.nextInt();
      }
    }
    for(i = 0;i < m;i++){
      b[i] = sc.nextInt();
    }

    for(i = 0;i < n;i++){
      for(j = 0;j < m;j++){
        c[i] += a[i][j] * b[j];
      }
    }

    for(i = 0;i < n;i++){
      System.out.println(c[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}