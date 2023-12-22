import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char prev = 'x';
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (prev == c) {
        System.out.println("Bad");
        return;
      }
      prev = c;
    }
    System.out.println("Good");
  }  
}
