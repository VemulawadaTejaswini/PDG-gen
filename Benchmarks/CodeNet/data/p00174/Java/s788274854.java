import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int g = 0;
    int ap = 0;
    int bp = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.equals("0")) {
        if (ap > bp) {
          ap++;
        } else {
          bp++;
        }
        System.out.println(ap + " " + bp);
        break;
      }
      for (int ii = 0; ii < line.length(); ii++) {
        char c = line.charAt(ii);
        if (g == 0 && ii == 0) {
          continue;
        }
        if (c == 'A') {
          ap++;
        } else {
          bp++;
        }
        if (ii == 0) {
          System.out.println(ap + " " + bp);
          ap = bp = 0;
        }
      }
      g++;
    }
  }
}