import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    if (N == 1) {
      System.out.println(M);
      return;
    }
    int maxDiv = 1;
    for (int i = M/2; i >= 2; i--) {
      if (M % i == 0) {
        if (N <= M/i) {
          maxDiv = i;
          break;
        }
      }
    }
    System.out.println(maxDiv);
  }
}