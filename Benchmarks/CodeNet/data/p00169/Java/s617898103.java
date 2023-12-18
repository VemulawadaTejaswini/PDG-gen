import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String work = scanner.nextLine();
      if (work.equals("0")) {
        break;
      }
      String works[] = work.split(" ");
      int s = 0;
      int oc = 0;
      for (int ii = 0; ii < works.length; ii++) {
        int w = Integer.parseInt(works[ii]);
        if (2 <= w && w <= 9) {
          s += w;
        } else if (10 <= w && w <= 13) {
          s += 10;
        } else {
          oc++;
        }
      }
      s += oc;
      for (int ii = 0; ii < oc; ii++) {
        if (s + 10 <= 21) {
          s += 10;
          break;
        }
      }

      if (s > 21) {
        s = 0;
      }

      System.out.println(s);
    }
  }
}