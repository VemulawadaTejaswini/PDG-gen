import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    X = scan.nextInt();
    Y = scan.nextInt();
    /* The equations c + t = X --> 2c + 2t = 2X 
    and 2c + 4t = Y give us 2t = Y - 2X */
    
    if ((Y-2X)%2 == 0) {
      System.out.println("Yes");
    }
    
    System.out.println("No");
  }
}
