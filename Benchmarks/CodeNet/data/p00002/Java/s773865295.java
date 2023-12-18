import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line;
    String out = "";
    for (;;) {
      line = scanner.nextLine();
      if (line.length() == 0) {
        break;
      }
      String[] s = new String[2];
      s = line.split(" ");
      int a = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
      out += Integer.toString(a).length() + "\n";
    }
    System.out.println(out);
  }
}