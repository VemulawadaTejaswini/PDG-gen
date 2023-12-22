import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double d = in.nextDouble();
    double t = in.nextDouble();
    double s = in.nextDouble();
    double last = d/s;
    if(last <= t) {
      System.out.print("Yes");
    }else {
    System.out.print("No");
    }
  }
}