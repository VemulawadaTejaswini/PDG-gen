public class Main{
  static double e = 0.0000000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double xa, ya, xb, yb, xc, yc, xd, yd;

    for(;sc.hasNext();){
      xa = sc.nextDouble(); ya = sc.nextDouble();
      xb = sc.nextDouble(); yb = sc.nextDouble();
      xc = sc.nextDouble(); yc = sc.nextDouble();
      xd = sc.nextDouble(); yd = sc.nextDouble();

      if((xa - xb) * (xc - xd) + (ya - yb) * (yc - yd) < e &&
          (xa - xb) * (xc - xd) + (ya - yb) * (yc - yd) > -e)
        out.println("YES");
      else out.println("NO");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}