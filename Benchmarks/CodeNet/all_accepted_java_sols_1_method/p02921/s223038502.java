import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int total =0;
    for (int i =0; i<3; i++) {
      if (S.charAt(i) == T.charAt(i)) total++;
    }
    System.out.print(total);
  }
}