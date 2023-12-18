import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String out = "";
    for (int ii = 0; ii < n; ii++) {
      Deque<Integer> in = new ArrayDeque<Integer>();
      Deque<Integer> left = new ArrayDeque<Integer>();
      Deque<Integer> right = new ArrayDeque<Integer>();
      for (int jj = 0; jj < 10; jj++) {
        in.addLast(scanner.nextInt());
      }
      for (;;) {
        if (in.isEmpty()) {
          out += "YES\n";
          break;
        }
        int p = in.removeFirst();
        if (left.isEmpty()) {
          left.addLast(p);
          continue;
        }
        if (right.isEmpty()) {
          right.addLast(p);
          continue;
        }
        if (p > left.getLast()) {
          left.addLast(p);
          continue;
        }
        if (p > right.getLast()) {
          right.addLast(p);
          continue;
        }
        out += "NO\n";
        break;
      }
    }
    System.out.print(out);
  }
}