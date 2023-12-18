public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, b, c, d, e, f, x, y;

    for(;sc.hasNext();){
      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();
      d = sc.nextDouble();
      e = sc.nextDouble();
      f = sc.nextDouble();

      x = (e * c - b * f) / (a * e - b * d);
      y = (-d * c + a * f) / (a * e - b * d);
      if(x <= 0 && x >= -0.0005)x*=-1;
      if(y <= 0 && y >= -0.0005)y*=-1;

      System.out.printf("%.3f  %.3f%n", x, y);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}