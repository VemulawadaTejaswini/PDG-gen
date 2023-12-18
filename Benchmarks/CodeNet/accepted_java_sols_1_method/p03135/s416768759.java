import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = (double)in.nextInt();
    double b = (double)in.nextInt();
    in.close();
    double ans = a / b;
    System.out.println(ans);
  }
}