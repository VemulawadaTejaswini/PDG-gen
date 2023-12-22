import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
	double xr = (x*60 + y)/2.0;
    double yr = 6.0*y;
    double e = Math.max(xr-yr, yr-xr);
    double r = Math.sqrt(b*b + c*c - 2*b*c*Math.cos(Math.toRadians(e)));
 	
    System.out.println(r);
  }
 
}