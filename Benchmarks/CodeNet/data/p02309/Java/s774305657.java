public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double c1x, c1y, c1r, c2x, c2y, c2r;
    double ax, ay, bx, by, hx, hy;
    double lx, ly, s, ah, tmp;

    c1x = sc.nextDouble(); c1y = sc.nextDouble(); c1r = sc.nextDouble();
    c2x = sc.nextDouble(); c2y = sc.nextDouble(); c2r = sc.nextDouble();

    lx = c2x - c1x; ly = c2y - c1y;
    s = lx * lx + ly * ly;

    ah = (s + c1r * c1r - c2r * c2r) / 2 / Math.sqrt(s);

    hx = c1x + lx * ah / Math.sqrt(s);
    hy = c1y + ly * ah / Math.sqrt(s);
    
    bx = ly * Math.sqrt((c1r * c1r - ah * ah) / s);
    by = -lx * Math.sqrt((c1r * c1r - ah * ah) / s);

    ax = hx + bx; ay = hy + by;
    bx = hx - bx; by = hy - by;

    if(ax > bx || (ax == bx && ay > by)){
      tmp = ax; ax = bx; bx = tmp;
      tmp = ay; ay = by; by = tmp;
    }
    out.println(ax + " " + ay + " " + bx + " " + by);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}