import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i].equals("A")) {
        start = i;
        break;
      }
    }
    for (int i = s.length - 1; i >= 0; i--) {
      if (s[i].equals("Z")) {
        end = i;
        break;
      }
    }
    System.out.println(end - start + 1);
  }
}