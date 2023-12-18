import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  String s;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      s = sc.next();
    } finally {
      sc.close();
    }
  }

  String solve() {
    return s.substring(0, 3);
  }
}
