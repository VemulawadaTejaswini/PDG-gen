import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      boolean isAtIn = false;
      int cnt = 0;
      String str = "";
      for (int ii = 0; ii < line.length(); ii++) {
        char c = line.charAt(ii);
        if (c == '@') {
          isAtIn = true;
          continue;
        }
        if (isAtIn) {
          cnt = c - '0';
          isAtIn = false;
          continue;
        }
        str += c;
        if (cnt != 0) {
          cnt--;
          for (int jj = 0; jj < cnt; jj++) {
            str += c;
          }
          cnt = 0;
        }
      }
      out += str + "\n";
    }
    System.out.print(out);
  }
}