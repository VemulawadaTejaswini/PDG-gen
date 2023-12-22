import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> ary = new ArrayList<>();

    while (true) {
      double input = Double.parseDouble(sc.next());
      ary.add(input);
      if (ary.size() == 1) break;
    }
    
    double a = ary.get(0);
    double x = Math.PI;
    
    double s = Math.pow(a,2) * x;
    double m = a * 2 * x;

    System.out.printf("%f",s);
    System.out.print(" ");
    System.out.printf("%f",m);
  }

}