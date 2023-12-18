import java.util.*;

public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
          
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double h = sc.nextDouble();
      double m = sc.nextDouble();
      
      if (h == 12 && m == 0) {
         System.out.println("0");
      } else {
         double t = (h*60 + m) * 360 / (12*60);
         double l = m*360/60;
         double ang = t - l;
         double coss = Math.cos(Math.toRadians(ang));
         double ans = Math.sqrt(a*a + b*b - 2*a*b*coss);
         System.out.println(ans);
      }   
   }
}