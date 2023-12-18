import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int N = scan.nextInt();
    
    for (int i = 1; i <= N; i++) {
      int p_i = scan.nextInt();
      
      if (p_i == X) {
        X = X+1;
      }
    }
    System.out.println(X);
  }
}
    
