import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int number = Integer.valueOf(a + b).intValue();
    String ans = "No";
    for (int i = 0; i * i <= number; i++) {
      if (i * i == number) {
        ans = "Yes";
      }
    }
    System.out.println(ans);
  }
}
