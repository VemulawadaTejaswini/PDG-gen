import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    ArrayList<Double> ary = new ArrayList<>();

    while (true) {
      double input = Integer.parseInt(sc.next());
      ary.add(input);
      if (ary.size() == 2) break;
    }
    
    double a = ary.get(0);
    double b = ary.get(1);
    
    int ans1 = (int)(a / b);
    int ans2 = (int)(a % b);
    double ans3 = a / b;

    System.out.printf("%d",ans1);
    System.out.print(" ");
    System.out.printf("%d",ans2);
    System.out.print(" ");
    System.out.printf("%f",ans3);
  }
}