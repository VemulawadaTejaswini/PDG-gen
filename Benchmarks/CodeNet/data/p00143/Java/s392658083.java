public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, xk, yk, xs, ys;
    int[] x, y;

    n = sc.nextInt();
    x = new int[4]; y = new int[4];
    for(i = 0;i < n;i++){
      for(j = 0;j < 3;j++){
        x[j] = sc.nextInt(); y[j] = sc.nextInt();
      }
      x[3] = x[0]; y[3] = y[0];
      xk = sc.nextInt(); yk = sc.nextInt();
      xs = sc.nextInt(); ys = sc.nextInt();
      if(solve(x, y, xk, yk) + solve(x, y, xs, ys) == 2)out.println("OK");
      else out.println("NG");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int solve(int[] x, int[] y, int x0, int y0){
    int i, j, countr, n;
    int ax, ay, bx, by, tmp;

    countr = 0; n = 3;

    for(j = 0;j < n;j++){
      if((x[j] - x0) * (y[j + 1] - y0) - (y[j] - y0) * (x[j + 1] - x0) == 0){
        if((x[j] - x0) * (x[j + 1] - x0) <= 0
        && (y[j] - y0) * (y[j + 1] - y0) <= 0)break;
        else if(x0 < x[j + 1] && x0 < x[j] && y0 == y[j] && y0 == y[j + 1])
          if((y[(j - 1 + n) % n] - y0) * (y[(j + 2) % n] - y0) > 0)countr++;
      }

      if((y[j] - y0) * (y[j + 1] - y0) <= 0 && y0 != y[j + 1]){
        ax = x[j]; ay = y[j];
        bx = x[j + 1]; by = y[j + 1];

        if(ay > by){
          tmp = ay; ay = by; by = tmp;
          tmp = ax; ax = bx; bx = tmp;
        }
        if((ax - x0) * (by - y0) - (bx - x0) * (ay - y0) > 0){
          countr++;
          if((y[(j - 1 + n) % n] - y0) * (y[j + 1] - y0) > 0 && y[j] == y0){
            countr++;
          }
        }
      }
    }

    if(j < n)return 1;
    else{
      if(countr % 2 == 1)return 2;
      else return 0;
    }
  }
}