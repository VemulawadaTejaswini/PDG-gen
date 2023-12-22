import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String originalMsg = sc.next();
    String missingMsg = "";
    for (int i = 0; i < originalMsg.length(); i++) {
      missingMsg = missingMsg + "x";
    }
    
    System.out.println(missingMsg);
    
  }
  
}