import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ss = sc.next();
    String[] s = ss.split("");
    if ((s[0].equals("R") && s[1].equals("R")) || (s[1].equals("R") && s[2].equals("R"))) {
      System.out.println("2");
    } else if (s[0].equals("R") || s[1].equals("R") || s[2].equals("R")) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
}