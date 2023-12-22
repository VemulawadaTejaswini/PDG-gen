import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int first = Integer.parseInt(s.substring(0,2), 10);
    int second = Integer.parseInt(s.substring(2,4), 10);

    if (second >= 1 && second <= 12) {
      if (first >= 1 && first <= 12) {
        System.out.println("AMBIGUOUS");
      } else {
        System.out.println("YYMM");
      }
    } else {
      if (first >= 1 && first <= 12) {
        System.out.println("MMYY");
      } else {
        System.out.println("NA");
      }
    }
  }
}
