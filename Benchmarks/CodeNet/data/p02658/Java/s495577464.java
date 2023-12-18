import java.util.*;

public class Main {
  private static final double MAX = 1e18;
  
  public static void main(String args[]) {
  	long multiplication = 1;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    for (int i=0; i<n; i++) {
      long num = in.nextLong();
      if (num == 0) {
        System.out.print(0);
        return;
      } 
      
      if (multiplication != -1) {
        if (MAX / multiplication > num) {
          multiplication = -1;
        } else {        
          multiplication *= num;
        }
      }
    }
    
    System.out.print(multiplication);
  }
}
