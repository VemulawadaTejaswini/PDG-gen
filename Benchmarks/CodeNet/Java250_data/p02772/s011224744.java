import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      if (isMultiples(2, x[i])) {
        if (isMultiples(3, x[i]) || isMultiples(5, x[i])) {
          continue;
        }
	    System.out.println("DENIED");
        return;
      }
    }
    
    System.out.println("APPROVED");
  }
  public static boolean isMultiples(int multiples, int n) {
    return ((n % multiples) == 0);
  }
}