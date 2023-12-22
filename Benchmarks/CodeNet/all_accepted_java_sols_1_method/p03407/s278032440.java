import java.io.IOException;
import java.util.Scanner;

public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    int A = s.nextInt();
    int B = s.nextInt();
    int C = s.nextInt();
    
    System.out.println(C <= A+B ? "Yes" : "No");
 
  }
}
