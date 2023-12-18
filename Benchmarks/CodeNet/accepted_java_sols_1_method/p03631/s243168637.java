import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String first = s.substring(0,1);
    String last = s.substring(2,3);

    if (first.equals(last)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
