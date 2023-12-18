import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String stringS = sc.next();
    String stringT = sc.next();
    
    int lengthS = sc.nextInt();
    int lengthT = sc.nextInt();
    
    String stringU = sc.next();
    
    if (stringU.equals(stringS)) {
      lengthS--;
    } else {
      lengthT--;
    }
    
    System.out.println(lengthS + " " + lengthT);
    
  }
  
}