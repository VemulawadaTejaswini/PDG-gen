import java.util.*;
import java.util.regex.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int ii = 0; ii < n; ii++) {
      String line = scanner.nextLine();
      Pattern pattern3 = Pattern.compile("Hoshino");
      Matcher matcher3 = pattern3.matcher(line);
      out += matcher3.replaceAll("Hoshina") + "\n";
    }
    System.out.print(out);
  }
}