import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    int count = 0;
    for (int i = 0; i < s.length; i++) {
      if (Integer.parseInt(s[i]) == 1) {
        count++;
      }
    }
    System.out.println(count);
  }
}