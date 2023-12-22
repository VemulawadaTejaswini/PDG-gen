import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String o = sc.next();
    String e = sc.next();

    sc.close();

    String[] O = o.split("");
    String[] E = e.split("");

    String ans = "";

    for (int i = 0; i < O.length; i++) {
      if ((O.length + E.length) % 2 != 0) {
        if (i == O.length - 1) {
          ans += O[i];
        } else {
          ans += O[i] + E[i];
        }
      } else {
        ans += O[i] + E[i];
      }
    }

    System.out.println(ans);

  }

}