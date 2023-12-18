import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      char[] s = sc.next().toCharArray();
      if (s.length == 2) {
        System.out.println(s);
      } else {
        for (int i = 0; i < 3; i++) {
          System.out.print(s[2-i]);
        }
      }
    } finally {
      sc.close();
    }
  }
}
