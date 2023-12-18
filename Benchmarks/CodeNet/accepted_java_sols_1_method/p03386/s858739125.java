import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    final int A = s.nextInt();
    final int B = s.nextInt();
    final int K = s.nextInt();
    
    for (int i = A; i <= B; i++) {
    	if (i < A+K || i > B-K) {
    		System.out.println(i);
    	}
    }

  }
}
