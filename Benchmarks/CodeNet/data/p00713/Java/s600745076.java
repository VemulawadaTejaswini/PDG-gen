public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, max, a;
    double[] x, y;

    for(;;out.println(max)){
      n = sc.nextInt(); if(n == 0)break;
      x = new double[n]; y = new double[n];
      for(i = 0;i < n;i++){
        x[i] = sc.nextDouble(); y[i] = sc.nextDouble();
      }
      max = 1;
      for(i = 0;i < n;i++)for(j = i + 1;j < n;j++){
        if((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) < 4){
          a = solve(x, y, n, i, j);
          if(max < a)max = a;
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int solve(double[] x, double[] y, int n, int i, int j){
    int count, res, k;
    double ax, ay, bx, by, hx, hy, lx, ly, s, ah;

    lx = x[j] - x[i]; ly = y[j] - y[i];
    s = lx * lx + ly * ly;
    ah = Math.sqrt(s) / 2;

    hx = x[i] + lx * ah / Math.sqrt(s);
    hy = y[i] + ly * ah / Math.sqrt(s);

    bx = ly * Math.sqrt((1.0 - ah * ah) / s);
    by = -lx * Math.sqrt((1.0 - ah * ah) / s);

    ax = hx + bx; ay = hy + by;
    bx = hx - bx; by = hy - by;

    count = 0;
    for(k = 0;k < n;k++)
      if((ax - x[k]) * (ax - x[k]) + (ay - y[k]) * (ay - y[k]) < 1.00001)count++;
    res = count;
    count = 0;
    for(k = 0;k < n;k++)
      if((bx - x[k]) * (bx - x[k]) + (by - y[k]) * (by - y[k]) < 1.00001)count++;
    if(res < count)res = count;
    return res;
  }
}