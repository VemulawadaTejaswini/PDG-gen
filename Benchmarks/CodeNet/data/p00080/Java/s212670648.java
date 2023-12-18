import java.util.*;

public class Main{
  static final double EPS = 0.00001;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      double q = sc.nextInt();
      if(q < 0) break;

      double x = q / 2.0;

      while(Math.abs(x * x * x - q) >= EPS){
        x = x - (x * x * x - q) / (3 * x * x);
      }

      System.out.printf("%.6f\n", x);
    }
  }
}