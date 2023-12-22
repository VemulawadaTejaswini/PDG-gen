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
          ap = bp < 10 ? 11 : bp + 2;
        } else {
          bp = ap < 10 ? 11 : ap + 2;
        }
        System.out.println(ap + " " + bp);
        break;
      }
      for (int ii = 0; ii < line.length(); ii++) {
        char c = line.charAt(ii);
        if (ii == 0) {
          if (g == 0) {
            continue;
          }
          if (g % 3 != 0) {
            if (c == 'A') {
              ap = bp < 10 ? 11 : bp + 2;
            } else {
              bp = ap < 10 ? 11 : ap + 2;
            }
            System.out.println(ap + " " + bp);
            ap = bp = 0;
          } else {
            if (ap > bp) {
              ap = bp < 10 ? 11 : bp + 2;
            } else {
              bp = ap < 10 ? 11 : ap + 2;
            }
            System.out.println(ap + " " + bp);
            ap = bp = 0;
          }
          continue;
        }
        if (c == 'A') {
          ap++;
        } else {
          bp++;
        }
      }
      g++;
    }
  }
}