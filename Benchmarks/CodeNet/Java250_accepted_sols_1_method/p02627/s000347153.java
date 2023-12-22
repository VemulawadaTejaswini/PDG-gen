import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCases = "abcdefghijklmnopqrstuvwxyz";
    
    String oneChar = sc.next();
    if (upperCases.indexOf(oneChar) >= 0) {
       System.out.println("A");
    } else {
       System.out.println("a");
    }
  }
}