import java.util.*;

public class Main {
  public static void main(String[] args) {
    int K, X;
    try(Scanner sc = new Scanner(System.in)) {
      K = sc.nextInt();
      X = sc.nextInt();
    }
    int m = X - (K-1);
    int M = X + (K-1);
    int count = 0;
    for( int i = m; i <= M; i++ ) {
      if ( count > 0 ) {
        System.out.print(" ");
      }
      System.out.print(i);
      count++;
    }
    System.out.println();
  }
}