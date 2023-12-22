import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double a = Double.parseDouble(sc.next());
      double b = Double.parseDouble(sc.next());
      double x = Double.parseDouble(sc.next());

      double ans = 0;

      double halfVol = a*a*b/2;

      if(x>halfVol){ //1
        double kk = 2*(a*a*b-x)/(a*a*a);
        ans = Math.atan(kk);
        ans = Math.toDegrees(ans);
      }
      else if(x==halfVol){ //2
        ans = 45;
      }
      else if(x<halfVol){ //3
        double kk = a*b*b/2/x;
        ans = Math.atan(kk);
        ans = Math.toDegrees(ans);
      }

      System.out.println(ans);

    }
}
