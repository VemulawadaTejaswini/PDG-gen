public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    double[] x, y;
    int i, j;
    double sum, ax, ay, bx, by;

    for(j = 1;;){
      n = sc.nextInt();
      if(n == 0)break;
      x = new double[n];
      y = new double[n];

      for(i = 0;i < n;i++){
        x[i] = sc.nextDouble();
        y[i] = sc.nextDouble();
      }

      sum = 0.0;
      for(i = 0;i < n - 2;i++){
        ax = x[i + 1] - x[0];
        ay = y[i + 1] - y[0];
        bx = x[i + 2] - x[0];
        by = y[i + 2] - y[0];
        sum += (ax * by - ay * bx) / 2.0;
      }

      System.out.printf("%d %.1f%n", j++, -sum);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}