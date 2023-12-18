import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    Deque<Integer> room = new ArrayDeque<Integer>();
    for (int ii = 1; ii <= m; ii++) {
      room.addLast(ii);
    }
    while (scanner.hasNext()) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      room.remove(x);
      room.addFirst(x);
    }
    while (!room.isEmpty()) {
      out += room.removeFirst() + "\n";
    }
    System.out.print(out);
  }
}