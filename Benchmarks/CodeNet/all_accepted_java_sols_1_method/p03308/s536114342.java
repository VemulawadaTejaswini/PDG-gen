
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);

    System.out.println(A[A.length - 1] - A[0]);
  }
}