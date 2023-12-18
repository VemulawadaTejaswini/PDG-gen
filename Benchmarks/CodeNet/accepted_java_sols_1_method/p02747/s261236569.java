import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();
    
    String ans = S.replaceAll("hi", "");
    System.out.println(ans.length() == 0 ? "Yes" : "No");
  }
}
