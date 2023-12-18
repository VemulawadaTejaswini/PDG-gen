import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      int b = scn.nextInt();
      int h = scn.nextInt();
      int m = scn.nextInt();
      double hh = h*30 + m/2;
      double mm = m*6;
      double x = hh - mm;
 
      double cosx = Math.cos(Math.toRadians(x));
      double ans2 = a*a + b*b - 2*a*b*cosx;
      double ans = Math.sqrt(ans2);
      System.out.println(ans);
	}
}
