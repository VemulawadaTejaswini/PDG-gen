import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      boolean[] ruis = new boolean[3];
      int outc = 0;
      int score = 0;
while (outc < 3) {
      String line = scanner.nextLine();
      if (line.equals("OUT")) {
        outc++;
        if (outc == 3) {
          out += score + "\n";
          break;
        }
      } else if (line.equals("HOMERUN")) {
        score++;
        for (int jj = 0; jj < ruis.length; jj++) {
          if (!ruis[jj]) {
            continue;
          }
          score++;
          ruis[jj] = false;
        }
      } else if (line.equals("HIT")) {
        if (ruis[2]) {
          score++;
          ruis[2] = false;
        }
        if (ruis[1]) {
          ruis[2] = true;
          ruis[1] = false;
        }
        if (ruis[0]) {
          ruis[1] = true;
        }
        ruis[0] = true;
      }
}
    }
    System.out.print(out);
  }
}