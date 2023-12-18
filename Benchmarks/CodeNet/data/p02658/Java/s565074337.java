import java.util.*;

public class Main {
  private const double MAX = 1e18;
  public static void main(String args[]) {
  	double multiplication = 0;
    Scanner in = new Scanner(Syste.in);
    int n = in.nextInt();
    for (int i=0; i<n; i++) {
      int num = in.nextInt();
      multiplication *= num;
      if (multiplication == 0) {
        break;
      }
      
      if (multiplication > MAX) {
        System.out.print(-1);
        return
      }
    }
    
    System.out.print(multiplication);
  }
}