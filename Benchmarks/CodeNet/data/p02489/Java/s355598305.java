import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int i = 1;
    while (true) {
      int x = in.nextInt();
      if (x == 0) {
        break;
      }
      out.printf("Case %d: %d\n", i, x);
    }

    out.flush();
  }
}