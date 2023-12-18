import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      String[] tr = new String[53];
      int pos = 26;
      String line = scanner.nextLine();
      for (int jj = 0, sum = 0; sum < line.length(); jj++) {
        int type = jj % 2 == 0 ? 1 : 2;
        String work = line.substring(sum, sum + type);
        sum += type;
        if (type == 1) {
          tr[pos] = work;
          continue;
        }
        if (work.equals("->")) {
          pos++;
        } else {
          pos--;
        }
      }
      for (int jj = 0; jj < tr.length; jj++) {
        if (tr[jj] == null) {
          continue;
        }
        out += tr[jj];
      }
      out += "\n";
    }
    System.out.print(out);
  }
}