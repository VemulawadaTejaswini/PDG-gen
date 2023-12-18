import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int Y = scan.nextInt();
    /* This comes from the equations c + t = X 
    --> 2c + 2t = 2X and 2c + 4t = Y, so 2t = Y - 2X */
    
    if ((4*X-Y) > 0 && (Y-2*X)%2 == 0) {
      System.out.println("Yes");
    }
    
    System.out.println("No");
  }
}
