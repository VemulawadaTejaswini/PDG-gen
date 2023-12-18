import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    for (int i = S.length - 2; 2 <= i; i = i - 2) {
      String s1 = s.substring(0, i / 2);
      String s2 = s.substring(i/2, i);
      if (s1.equals(s2)) {
        System.out.println(i);
        break;
      }
    }

  }

}
