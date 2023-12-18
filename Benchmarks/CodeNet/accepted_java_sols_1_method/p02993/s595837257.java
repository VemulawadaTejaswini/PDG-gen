import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    char a = s.charAt(0);
    for(int i = 1; i < 4; i++) {
      if (a == (s.charAt(i))) {
        System.out.println("Bad");
        return;
      }
      a = s.charAt(i);
    }
    System.out.println("Good");
    return;
  }
}
  
