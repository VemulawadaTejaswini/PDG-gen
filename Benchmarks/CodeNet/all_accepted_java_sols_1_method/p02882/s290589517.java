import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();

    double S = x/a;

    if((a*b)/2>=S){
      double a1 =(2*S)/b;
      double result = Math.atan(b/a1);
      System.out.println(Math.toDegrees(result));

    }else{

      double n = a*b-S;

      double h = 2*n/a;
      n = a*h/2;

      System.out.println(Math.toDegrees(Math.atan(h/a)));

    }

  }

}
