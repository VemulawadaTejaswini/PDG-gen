public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
//want gaisetu cyuusinn and R
    int n;
    double x1, x2, x3, y1, y2, y3, px, py, r;
    int i;
    double ax, ay, bx, by, l1x, l1y, l2x, l2y;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      x1 = sc.nextDouble();
      y1 = sc.nextDouble();
      x2 = sc.nextDouble();
      y2 = sc.nextDouble();
      x3 = sc.nextDouble();
      y3 = sc.nextDouble();

      ax = (x1 + x2) / 2.0;
      ay = (y1 + y2) / 2.0;
      bx = (x1 + x3) / 2.0;
      by = (y1 + y3) / 2.0;
      l1x = x1 - x2;
      l1y = y1 - y2;
      l2x = x1 - x3;
      l2y = y1 - y3;

      px = ((ax * l1x + ay * l1y) * l2y + (bx * l2x + by * l2y) * (-l1y))
      / (l1x * l2y - l2x * l1y);
      py = ((ax * l1x + ay * l1y) * (-l2x) + (bx * l2x + by * l2y) * l1x)
      / (l1x * l2y - l2x * l1y);
      r = Math.sqrt((px - x1) * (px - x1) + (py - y1) * (py - y1));

      System.out.printf("%.3f %.3f %.3f%n", px, py, r);

    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}