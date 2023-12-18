import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int N = scan.nextInt();
    int Y = X;
    
    int i = 1;
    while (i <= N) {
      int p_i = scan.nextInt();
      
      if (p_i == X || p_i == Y) {
        X = X + 1;
        Y = Y - 1;
        i = 1;
      }
    }
    System.out.println(X);
  }
}
    
