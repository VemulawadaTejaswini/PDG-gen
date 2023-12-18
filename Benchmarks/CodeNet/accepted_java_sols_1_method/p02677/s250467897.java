import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();

    double h = sc.nextDouble();
    double m = sc.nextDouble();

    double s = h/12*360;
    double l = m/60*360;

    s += l/12;

    double res = Math.abs(s-l);
    res = Math.min(360-res,res);

    double r = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(res)));

    System.out.println(r);

  }

}
