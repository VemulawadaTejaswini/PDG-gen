import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String a = s.next();
    String b = s.next();
    Boolean flag = true;
    if (a.equals("H")) {
      if (b.equals("H")) {
        flag = true;
      } else {
        flag = false;
      }
    } else {
      if (b.equals("H")) {
        flag = false;
      } else {
        flag = true;
      }
    }
    if (flag) {
      System.out.println("H");
    } else {
      System.out.println("D");
    }
  }
}
