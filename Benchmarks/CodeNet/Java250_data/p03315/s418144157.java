import java.util.*;
 
public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int ans = 0;
      for(int i = 0; i < 4; i++) {
          String next = String.valueOf(s.charAt(i));
          if(next.equals("+")) {
               ans = ans + 1;
          } else if(next.equals("-")) {
               ans = ans -1;
         }
      }
      System.out.println(ans);
  }
}