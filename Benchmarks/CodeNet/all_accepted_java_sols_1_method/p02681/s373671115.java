import java.util.Scanner;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder(sc.next());
    StringBuilder t = new StringBuilder(sc.next());
    int len = t.length();
    t = t.deleteCharAt(len - 1);
    String ss = s.toString();
    String tt = t.toString();
    if (ss.equals(tt)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}