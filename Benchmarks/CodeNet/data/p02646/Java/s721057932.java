import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  long a;
  long v;
  long b;
  long w;
  long t;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = sc.nextLong();
      v = sc.nextLong();
      b = sc.nextLong();
      w = sc.nextLong();
      t = sc.nextLong();
    } finally {
      sc.close();
    }
  }

  String solve() {
    return possible() ? "YES" : "NO";
  }

  boolean possible() {
    if (Math.abs(a - b) <= t * (v - w)) return true;
    return false;
  }
}
