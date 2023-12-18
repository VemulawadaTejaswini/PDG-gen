import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  public static class P {
    double x;
    double y;

    P(double _x, double _y) {
      x = _x;
      y = _y;
    }
  }

  public static void koch(int d, P pl, P pr) {
    //pl__s//u\\t__pr 

    if (d==0) return;

    P ps = new P((pl.x * 2 + pr.x)/3, (pl.y * 2 + pr.y)/3);
    P pt = new P((pl.x + pr.x * 2)/3, (pl.y + pr.y * 2)/3);
    P pu = new P(ps.x + (pt.x-ps.x)*0.5 - (pt.y-ps.y)*sqrt(3.0)*0.5, 
         ps.y + (pt.x-ps.x)*sqrt(3.0)*0.5 + (pt.y-ps.y)*0.5);

    koch(d-1, pl, ps); System.out.println(String.valueOf(ps.x) + ' ' + String.valueOf(ps.y));
    koch(d-1, ps, pu); System.out.println(String.valueOf(pu.x) + ' ' + String.valueOf(pu.y));
    koch(d-1, pu, pt); System.out.println(String.valueOf(pt.x) + ' ' + String.valueOf(pt.y));
    koch(d-1, pt, pr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    P pl = new P(0.0, 0.0);
    P pr = new P(100.0, 0.0);
    System.out.println(String.valueOf(pl.x) + ' ' + String.valueOf(pl.y));
    koch(n, pl, pr);
    System.out.println(String.valueOf(pr.x) + ' ' + String.valueOf(pr.y));
  }
}