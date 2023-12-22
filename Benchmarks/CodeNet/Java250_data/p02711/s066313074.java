import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      boolean b = false;
      char c = '7';
      
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      for (int i =0; i < n.length(); i++) {
        if (n.charAt(i) == c) {
          b = true;
          break;
        }
      }
      if (b) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}