import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String first_s = s.substring(0,2);
    String last_s = s.substring(2,4);
    int first = Integer.parseInt(first_s);
    int last = Integer.parseInt(last_s);

    if (0 < first && first <= 12 && 0 < last && last <= 12) {
      System.out.println("AMBIGUOUS");
    } else if (0 < last && last <= 12) {
      System.out.println("YYMM");
    } else if (0 < first && first <= 12) {
      System.out.println("MMYY");
    } else {
      System.out.println("NA");
    }
  }

}
