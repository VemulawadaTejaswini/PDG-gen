import java.util.*;

class Main {

  static int x4[] = {0, 1, 0, -1};
  static int y4[] = {1, 0, -1, 0};

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next().replaceAll("\\?", ".");
    String b = sc.next();
    for (int i = a.length() - b.length(); i >= 0; i--) {
      String s = a.substring(i, i + b.length());
      if (b.matches(s)) {
        a = a.replaceFirst(a.substring(0, i) + s, a.substring(0, i) + b).replaceAll("\\.", "a");
        System.out.println(a);
        return;
      }
    }
    System.out.println("UNRESTORABLE");
  }
}
