import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double total = 0;
    for (int i = 0; i < N; i++) {
      double money = sc.nextDouble();
      String A = sc.next();
      String B = "JPY";
      if (A.equals(B)) {
        total += money;
      } else {
        total += money * 380000;
      }
    }
    System.out.println(total);
  }
}
