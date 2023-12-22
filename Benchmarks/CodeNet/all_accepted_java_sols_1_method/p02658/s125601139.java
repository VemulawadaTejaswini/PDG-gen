import java.util.*;

public class Main {
  private static final long MAX = (long)1e18;
  
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
        if (num > MAX / multiplication) {
          multiplication = -1;
        } else {        
          multiplication *= num;
        }
      }
    }
    
    if (multiplication > MAX) {
        System.out.print(-1);
    } else {
      System.out.print(multiplication);
    }
  }
}
