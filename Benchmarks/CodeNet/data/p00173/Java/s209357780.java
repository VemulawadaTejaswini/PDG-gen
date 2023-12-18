import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String c = scanner.nextLine();
      int am = scanner.nextInt();
      int pm = scanner.nextInt();
      System.out.printf("%s %d %d\n", c, am + pm, (am * 2 + pm * 3) * 100);
    }
  }
}