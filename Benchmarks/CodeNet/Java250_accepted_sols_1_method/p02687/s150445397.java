import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    String ans = "ARC".equals(S) ? "ABC" : "ARC";
    System.out.println(ans);
  }
}
