import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
   	int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double rot;
    double hrot;
    double mrot;
    double ans;
    
   	hrot = h*30 + 30*m/60.0;
    
    mrot = 360*m/60.0;
    
    rot = Math.abs(hrot - mrot);
    if(rot > 180) rot = 360 - rot;
    
    ans = (double)a*a + (double)b*b - 2*a*b*Math.cos(Math.toRadians(rot));
    ans = Math.sqrt(ans);
    
    System.out.println(ans);
  }
}
