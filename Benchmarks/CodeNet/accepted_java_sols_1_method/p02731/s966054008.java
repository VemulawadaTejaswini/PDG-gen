import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double L = sc.nextDouble();
    double ans = (L / (double)3) * (L / (double)3) * (L / (double)3);
    System.out.println(ans);
  }
}