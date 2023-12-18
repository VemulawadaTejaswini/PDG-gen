public class Main{
  static double eps = 0.0000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double ux, uy, uz, ex, ey, ez;
    double[] x, y, z, a, ainv, s;
    int i;
    x = new double[3]; y = new double[3]; z = new double[3];
    a = new double[9]; ainv = new double[9]; s = new double[3];

    ux = sc.nextDouble(); uy = sc.nextDouble(); uz = sc.nextDouble();
    ex = sc.nextDouble(); ey = sc.nextDouble(); ez = sc.nextDouble();
    for(i = 0;i < 3;i++){
      x[i] = sc.nextDouble(); y[i] = sc.nextDouble(); z[i] = sc.nextDouble();
      a[i] = x[i] - ux; a[i + 3] = y[i] - uy; a[i + 6] = z[i] - uz;
    }
    getinv(a, ainv, 3);
    for(i = 0;i < 3;i++)
      s[i] = ainv[i * 3] * ex + ainv[i * 3 + 1] * ey + ainv[i * 3 + 2] * ez;
    if(solve(s))out.println("HIT");
    else out.println("MISS");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void getinv(double[] a, double[] ainv, int n){
    int i, j;
    double[][] x;
    x = new double[n][n * 2];
    for(i = 0;i < n;i++){
      for(j = 0;j < n;j++)x[i][j] = a[i * n + j];
      x[i][n + i] = 1;
    }
    for(i = 0;i < n;i++){
      for(j = i;j < n;j++)if(x[j][i] != 0)break;
      hswap(x, n, i, j);
      hdiv(x, n, i, x[i][i]);
      for(j = i + 1;j < n;j++)hdel(x, n, i, j);
    }
    for(i = 0;i < n;i++)for(j = 0;j < n;j++)ainv[n * i + j] = x[i][j + n];
    return;
  }
  private static void hswap(double[][] x, int n, int i, int j){
    int q;
    double tmp;
    for(q = 0;q < 2 * n;q++){
      tmp = x[i][q]; x[i][q] = x[j][q]; x[j][q] = tmp;
    }
    return;
  }
  private static void hdiv(double[][] x, int n, int i, double a){
    int q;
    for(q = i;q < n * 2;q++)x[i][q] /= a;
    return;
  }
  private static void hdel(double[][] x, int n, int i, int j){
    int q;
    double t = x[j][i];
    for(q = i;q < 2 * n;q++)x[j][q] -= x[i][q] * t;
    return;
  }
  private static boolean solve(double[] s){
    int i;
    for(i = 0;i < 3;i++)if(s[i] + eps < 0)return false;
    if(s[0] + s[1] + s[2] + eps <= 1.0)return false;
    return true;
  }
}