import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    String[] abc = { a, b, c };
    int turn = 0;
    while (true) {
      if (abc[turn].length() == 0) {
        System.out.println((char) (turn + 'A'));
        return;
      }
      char next = abc[turn].charAt(0);
      abc[turn] = abc[turn].substring(1, abc[turn].length());
      turn = next - 'a';
    }
  }
}