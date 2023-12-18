import java.util.*;
public class Main {
  public static void main(String... args) {
   	Scanner input = new Scanner(System.in);
  	String first = input.next();
    String second = input.next();
    
    int n = first.length();
    
    if (second.length() != n + 1) {
      System.out.println("No");
      return;
    }
    
    if (!second.substring(0, n).equals(first)) {
      System.out.println("No");
      return;
    }
    
    System.out.println("Yes");
  }
}