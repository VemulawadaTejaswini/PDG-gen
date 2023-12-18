import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int Y = scan.nextInt();
        
    if ((Y-2*X) >= 0 && (Y-2*X)%2 == 0 && (4*X-Y) >= 0) {
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}
