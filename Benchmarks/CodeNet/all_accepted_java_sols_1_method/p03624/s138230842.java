import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    String C = "abcdefghijklmnopqrstuvwxyz";
    char[] c = C.toCharArray();

    for (int i = 0; i < 26; i++) {
      if (!s.contains(String.valueOf(c[i]))) {
        System.out.println(c[i]);
        return;
      }
    }

    System.out.println("None");

  }

}
