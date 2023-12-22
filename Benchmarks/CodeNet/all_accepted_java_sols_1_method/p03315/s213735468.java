import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int x = 0;
    String str = scan.next();
    
    for (int i = 0; i <= 3; i++) {
      char ch = str.charAt(i);
      
      if (ch == '+') {
        x = x + 1;
      }
      
      if (ch == '-') {
        x = x - 1;
      }
    }
    
    System.out.println(x);
  }
}
