import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int maxDiv = 1;
    for (int i = 1; i <= Math.sqrt(M); i++) {
      if (M % i == 0) {
        int d1 = i;
        int d2 = M/i;
        if (M/d1 >= N) {
          maxDiv = Math.max(maxDiv, d1);
        }
        if (M/d2 >= N) {
          maxDiv = Math.max(maxDiv, d2);
        }
      }
    }
    System.out.println(maxDiv);
  }
}
