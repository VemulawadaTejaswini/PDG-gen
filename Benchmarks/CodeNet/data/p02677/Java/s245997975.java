import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();//1辺目
    int c = sc.nextInt();//2辺目
    int x = sc.nextInt();
    int y = sc.nextInt();
	double xr = (x*60 + y)/2.0;
    double yr = 6.0*y;
    System.out.println("x: " + xr + " y: " + yr);
    double e = Math.max(xr-yr, yr-xr);
    System.out.println(e);
    double r = Math.sqrt(b*b + c*c - 2*b*c*Math.cos(Math.toRadians(e)));
 	
    System.out.println(r);
  }
 
}