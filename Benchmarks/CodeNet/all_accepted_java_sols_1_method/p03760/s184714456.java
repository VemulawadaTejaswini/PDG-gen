import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String O = sc.next();
    String E = sc.next();
    for (int i = 0; i < E.length(); i++) {
      System.out.print(O.charAt(i));
      System.out.print(E.charAt(i));
    }
    if (O.length() > E.length()) {
      System.out.print(O.charAt(O.length() - 1));
    }
    System.out.println();
  }
}