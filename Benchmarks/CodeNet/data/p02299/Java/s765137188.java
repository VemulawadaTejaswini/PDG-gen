public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q;
    double[] x, y;
    int i, j, count;
    double x0, y0;

    n = sc.nextInt();
    x = new double[n + 1];
    y = new double[n + 1];

    for(i = 0;i < n;i++){
      x[i] = sc.nextDouble();
      y[i] = sc.nextDouble();
    }
    x[n] = x[0];
    y[n] = y[0];

    q = sc.nextInt();

    for(i = 0;i < q;i++){
      x0 = sc.nextDouble();
      y0 = sc.nextDouble();
      count = 0;

      for(j = 0;j < n;j++){
        if((x[j] - x0) * (y[j + 1] - y0) - (y[j] - y0) * (x[j + 1] - x0) == 0){
          if((x[j] - x0) * (x[j + 1] - x0) <= 0 || (y[j] - y0) * (y[j + 1] - y0) <= 0){
            break;
          }
        }
        if((y[j] - y0) * (y[j + 1] - y0) <= 0 && y0 != y[j] &&
        (x[j] + (x[j+1] - x[j]) * (y0 - y[j]) / (y[j+1] - y[j])) > x0){
          count++;
        }
      }

      if(j < n){
        System.out.println("1");
      }else{
        if(count % 2 == 1){
          System.out.println("2");
        }else{
          System.out.println("0");
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}