public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q;
    double[] x, y, x0, y0;
    int i, j;
    double s, ax, ay, bx, by, min;

    n = sc.nextInt();
    x = new double[n];
    y = new double[n];

    for(i = 0;i < n;i++){
      x[i] = sc.nextDouble();
      y[i] = sc.nextDouble();
    }

    q = sc.nextInt();
    x0 = new double[q];
    y0 = new double[q];

    for(i = 0;i < q;i++){
      x0[i] = sc.nextDouble();
      y0[i] = sc.nextDouble();
    }

    sc.close();

    for(j = 0;j < q;j++){
      ax = x[n - 1] - x0[j];
      ay = y[n - 1] - y0[j];
      bx = x[0] - x0[j];
      by = y[0] - y0[j];
      min = ax * by - bx * ay;
      for(i = 0;i < n - 1;i++){
        ax = x[i] - x0[j];
        ay = y[i] - y0[j];
        bx = x[i + 1] - x0[j];
        by = y[i + 1] - y0[j];
        s = ax * by - bx * ay;
        if(min > s)min = s;
      }

      if(min > 0){
        System.out.println("2");
      }else if(min == 0){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }

  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}