import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = Double.parseDouble(sc.next());
    double b = Double.parseDouble(sc.next());
    double tmp = (a + b) / 2.0 + 0.5;
    int ans = (int) tmp;
    System.out.println(ans);
  }
}