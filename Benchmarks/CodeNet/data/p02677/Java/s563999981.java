import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
      double b = scn.nextDouble();
      double h = scn.nextDouble();
      double m = scn.nextDouble();
      double hh = h*30 + m/2;
      double mm = m*6;
      double x = Math.abs(hh - mm);
      if(x > 180){
        x = 360 - x;
      }
 
      double cosx = Math.cos(Math.toRadians(x));
      double ans2 = a*a + b*b - 2*a*b*cosx;
      double ans = Math.sqrt(ans2);
      System.out.println(ans);
	}
}
