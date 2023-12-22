import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();

    sc.close();

    if (a.length() + 1 == b.length() && b.indexOf(a) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
