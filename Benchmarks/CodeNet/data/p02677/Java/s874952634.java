import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      int b = scn.nextInt();
      int h = scn.nextInt();
      int m = scn.nextInt();
      double hh = h*30;
      double mm = m*6;
      double x = 0;
      if(hh>mm){
        if(hh-mm>180){
          x = 360 + mm - hh;
        }else{
          x = hh - mm;
        }
      }if(mm>=hh){
        if(mm - hh>180){
          x = 360 + hh -mm;
        }else{
          x = mm - hh;
        }
      }
      double cosx = Math.cos(Math.toRadians(x));
      double ans2 = a*a + b*b - 2*b*c*cosx;
      double ans = Math.sqrt(ans2);
	}
}