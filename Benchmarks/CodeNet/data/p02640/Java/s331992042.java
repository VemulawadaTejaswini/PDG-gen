import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    X = scan.nextInt();
    Y = scan.nextInt();
    float F = Y-2X;
    /* This comes from the equations c + t = X 
    --> 2c + 2t = 2X and 2c + 4t = Y, so 2t = Y - 2X */
    
    if (F%2 == 0) {
      System.out.println("Yes");
    }
    
    System.out.println("No");
  }
}
