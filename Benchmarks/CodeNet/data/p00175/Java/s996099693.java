import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      if (a < 0) {
        break;
      }
      if (a == 0) {
        System.out.println(0);
        continue;
      }
      System.out.println(aaa(a));
    }
  }
  public static String aaa (int a) {
    if (a == 0) {
      return "";
    }
    return String.format("%s%d", aaa(a / 4), a % 4);
  }
}