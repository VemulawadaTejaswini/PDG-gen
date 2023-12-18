import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    while (true) {
      int x = in.nextInt();
      int y = in.nextInt();
      if (x == 0 && y == 0) {
        break;
      }
      out.printf("%d %d\n", Math.min(x, y), Math.max(x, y));
    }

    out.flush();
  }
}