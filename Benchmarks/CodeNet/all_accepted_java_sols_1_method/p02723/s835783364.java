import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();
    
    boolean ans = (S.charAt(2) == S.charAt(3) 
        && S.charAt(4) == S.charAt(5));
    System.out.println(ans ? "Yes" : "No");
  }
}